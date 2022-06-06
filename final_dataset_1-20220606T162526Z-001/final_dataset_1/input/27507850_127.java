public static Map<String, BDDOutgoingOriginalFlowFilterManager> forNetwork(
      BDDPacket pkt, Map<String, Configuration> configs, Map<String, BDDSourceManager> srcMgrs) {
    // hostname -> set of interfaces that will be values for the config's finite domain
    ImmutableMap.Builder<String, Set<String>> finiteDomainValues = ImmutableMap.builder();

    // hostname -> a representative active interface without an outgoingOriginalFlowFilter (if any)
    Map<String, String> repActiveIfacesWithoutOrigFlowFilters = new HashMap<>();

    // hostname -> iface name -> BDD for flows permitted by interface's outgoingOriginalFlowFilter
    Map<String, Map<String, BDD>> filterBdds = new HashMap<>();

    for (Configuration c : configs.values()) {
      String hostname = c.getHostname();
      Set<String> activeWithFilters =
          c.getAllInterfaces().values().stream()
              .filter(iface -> iface.getActive() && iface.getOutgoingOriginalFlowFilter() != null)
              .map(Interface::getName)
              .collect(ImmutableSet.toImmutableSet());

      // Find a representative active interface without an outgoingOriginalFlowFilter. Should be
      // nonnull iff there are active interfaces both with and without outgoingOriginalFlowFilters.
      String repActiveIfaceWithoutFilter =
          activeWithFilters.isEmpty()
              ? null
              : c.getActiveInterfaces().keySet().stream()
                  .filter(iface -> !activeWithFilters.contains(iface))
                  .findAny()
                  .orElse(null);

      if (repActiveIfaceWithoutFilter != null) {
        repActiveIfacesWithoutOrigFlowFilters.put(hostname, repActiveIfaceWithoutFilter);
        finiteDomainValues.put(
            hostname,
            ImmutableSet.<String>builder()
                .addAll(activeWithFilters)
                .add(repActiveIfaceWithoutFilter)
                .build());
      } else {
        finiteDomainValues.put(hostname, activeWithFilters);
      }

      filterBdds.put(hostname, buildFilterBdds(pkt, c, srcMgrs.get(hostname)));
    }

    Map<String, BDDFiniteDomain<String>> finiteDomains =
        BDDFiniteDomain.domainsWithSharedVariable(pkt, VAR_NAME, finiteDomainValues.build());

    // Allocate permit var
    BDD permitVar = allocatePermitVar(pkt);

    return toImmutableMap(
        configs.keySet(),
        Function.identity(),
        hostname ->
            new BDDOutgoingOriginalFlowFilterManager(
                finiteDomains.get(hostname),
                repActiveIfacesWithoutOrigFlowFilters.get(hostname),
                filterBdds.get(hostname),
                permitVar));
  }
