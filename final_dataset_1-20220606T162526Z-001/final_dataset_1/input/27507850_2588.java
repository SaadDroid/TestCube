@VisibleForTesting
  static List<AclSpecs> getAclSpecs(
      SortedMap<String, Configuration> configurations,
      Map<String, Set<IpAccessList>> specifiedAcls,
      FilterLineReachabilityRows answer) {
    List<AclSpecs.Builder> aclSpecs = new ArrayList<>();

    /*
     - For each ACL, build a CanonicalAcl structure with that ACL and referenced ACLs & interfaces
     - Deal with any references to undefined ACLs, IpSpaces, or interfaces
     - Deal with any cycles in ACL references
    */
    for (String hostname : configurations.keySet()) {
      if (specifiedAcls.containsKey(hostname)) {
        Configuration c = configurations.get(hostname);
        Set<IpAccessList> acls = specifiedAcls.get(hostname);
        HeaderSpaceSanitizer headerSpaceSanitizer = new HeaderSpaceSanitizer(c.getIpSpaces());
        Map<String, Interface> nodeInterfaces = c.getAllInterfaces();

        // Build graph of AclNodes containing pointers to dependencies and referencing nodes
        Map<String, AclNode> aclNodeMap = new TreeMap<>();
        for (IpAccessList acl : acls) {
          String aclName = acl.getName();
          if (!aclNodeMap.containsKey(aclName)) {
            createAclNode(
                acl,
                aclNodeMap,
                c.getIpAccessLists(),
                headerSpaceSanitizer,
                nodeInterfaces.keySet());
          }
        }

        // Sanitize nodes in graph (finds all cycles, creates sanitized versions of IpAccessLists)
        Set<String> sanitizedAcls = new TreeSet<>();
        for (AclNode node : aclNodeMap.values()) {
          if (!sanitizedAcls.contains(node.getName())) {
            List<ImmutableList<String>> cycles =
                sanitizeNode(node, new ArrayList<>(), sanitizedAcls, aclNodeMap);
            for (ImmutableList<String> cycleAcls : cycles) {
              answer.addCycle(hostname, cycleAcls);
            }
          }
        }

        // For each ACL specified by aclRegex, create a CanonicalAcl with its dependencies
        for (IpAccessList acl : acls) {
          String aclName = acl.getName();
          AclNode node = aclNodeMap.get(aclName);

          // Finalize interfaces. If ACL references all interfaces on the device, keep interfaces
          // list as-is; otherwise, add one extra interface to represent the "unreferenced
          // interface not originating from router" possibility. Needs to have a name different
          // from any referenced interface.
          Set<String> referencedInterfaces = node.getInterfaceDependencies();
          if (referencedInterfaces.size() < nodeInterfaces.size()) {
            // At least one interface was not referenced by the ACL. Represent that option.
            String unreferencedIfaceName = "unreferencedInterface";
            int n = 0;
            while (referencedInterfaces.contains(unreferencedIfaceName)) {
              unreferencedIfaceName = "unreferencedInterface" + n;
              n++;
            }
            referencedInterfaces = new TreeSet<>(referencedInterfaces);
            referencedInterfaces.add(unreferencedIfaceName);
          }

          CanonicalAcl currentAcl =
              new CanonicalAcl(
                  node.getSanitizedAcl(),
                  node.getAcl(),
                  node.getFlatDependencies(),
                  referencedInterfaces,
                  node.getLinesWithUndefinedRefs(),
                  node.getLinesInCycles());

          // If an identical ACL exists, add current hostname/aclName pair; otherwise, add new ACL
          boolean added = false;
          for (AclSpecs.Builder aclSpec : aclSpecs) {
            if (aclSpec.getAcl().equals(currentAcl)) {
              aclSpec.addSource(hostname, aclName);
              added = true;
              break;
            }
          }
          if (!added) {
            aclSpecs.add(AclSpecs.builder().setAcl(currentAcl).addSource(hostname, aclName));
          }
        }
      }
    }
    return aclSpecs.stream().map(AclSpecs.Builder::build).collect(Collectors.toList());
  }
