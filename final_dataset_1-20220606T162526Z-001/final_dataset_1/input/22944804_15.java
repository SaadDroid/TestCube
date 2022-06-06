public Map<String, Set<String>> getAttributes(Map<String, String> jwtToLocalAttributeMapping,
                                                                    JwtClaimsSet jwtClaimsSet) {
        Map<String, Set<String>> lookupAttributes = new HashMap<String, Set<String>>();
        if (jwtToLocalAttributeMapping == null || jwtClaimsSet == null) {
            return lookupAttributes;
        }
        /*
        Go through the localToJwtAttributeMapping entries and see if the jwt attribute is present in the jwt. If
        present, create an entry in the lookupAttributes, and insert an entry corresponding to the value in the jwt.
        As far as excluding duplicates is concerned:
        1. the JwtClaimsSet excludes duplicate entries with the same key
        2. The localToJwtAttributeMapping is ultimately derived from user-input state, but the OpenIdConnectConfig ctor
        excludes duplicate mapping entries (preserving the first). See MappingUtils.parseMappings. So
        when populating he lookupAttributes below, I don't need to exclude duplicate entries, as neither the JwtClaimsSet,
        nor the localToJwtAttributeMapping contains duplicate entries.
        Just to be sure, I will log an error if I encounter this situation, in case any of the above invariants are violated.
         */
        for (Map.Entry<String, String> entry : jwtToLocalAttributeMapping.entrySet()) {
            String jwtName = entry.getKey();
            if (jwtClaimsSet.isDefined(jwtName)) {
                String localName = entry.getValue();
                if (!lookupAttributes.containsKey(localName)) {
                    Set<String> value = new HashSet<String>();
                    //obtain the claim as an Object, and call toString on it, as a Set<String> needs to be populated.
                    String data = jwtClaimsSet.getClaim(jwtName).toString();
                    if (prefix != null && (prefixedAttributes.contains(localName) || prefixedAttributes.contains("*"))) {
                        data = prefix + data;
                    }
                    lookupAttributes.put(localName, CollectionUtils.asSet(data));
                } else {
                    logger.error("In JwtAttributeMapper.getAttributes, the " +
                            "jwtToLocalAttributeMappings appears to have duplicate entries: " + jwtToLocalAttributeMapping +
                            "; Or possibly the JwtClaimsSet has duplicate entries: " + jwtClaimsSet +
                            ". Will preserve the following existing mappings: " + lookupAttributes);
                }
            }
        }
        return lookupAttributes;
    }
