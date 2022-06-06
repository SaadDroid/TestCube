@Override
  public Map<ExternalIdBundle, ExternalId> resolve(Collection<ExternalIdBundle> bundles) {
    Map<ExternalIdBundle, ExternalId> result = new HashMap<ExternalIdBundle, ExternalId>();
    
    Set<String> bbgKeys = new HashSet<String>();
    Map<String, Collection<ExternalIdBundle>> bbgKey2Bundle = new HashMap<String, Collection<ExternalIdBundle>>();
    
    for (ExternalIdBundle bundle : bundles) {
      String bbgUniqueId = null;
      ExternalId preferredIdentifier = BloombergDomainIdentifierResolver.resolvePreferredIdentifier(bundle);
      if (preferredIdentifier != null) {
        if (!preferredIdentifier.getScheme().equals(ExternalSchemes.BLOOMBERG_BUID)) {
          
          String bloombergKey = BloombergDomainIdentifierResolver.toBloombergKey(preferredIdentifier);
          bbgKeys.add(bloombergKey);
          
          Collection<ExternalIdBundle> bundlesForKey = bbgKey2Bundle.get(bloombergKey);
          if (bundlesForKey == null) {
            bundlesForKey = new ArrayList<ExternalIdBundle>();
            bbgKey2Bundle.put(bloombergKey, bundlesForKey);
          }
          bundlesForKey.add(bundle);
          
        } else {
          bbgUniqueId = preferredIdentifier.getValue();
          result.put(bundle, ExternalSchemes.bloombergBuidSecurityId(bbgUniqueId));
        }
      } else {
        s_logger.info("Unable to identify any Bloomberg compatible identifier for {}", bundle);
        result.put(bundle, null);
      }
    }
    
    Map<String, String> bbgKey2BbgUniqueId = ReferenceDataProviderUtils.getBloombergUniqueIDs(bbgKeys, getReferenceDataProvider());
    
    for (String bbgKey : bbgKey2Bundle.keySet()) {
      String bbgUniqueId = bbgKey2BbgUniqueId.get(bbgKey);
       
      ExternalId identifier;
      if (bbgUniqueId == null) {
        identifier = null;
      } else {
        identifier = ExternalSchemes.bloombergBuidSecurityId(bbgUniqueId);
      }
      
      for (ExternalIdBundle bundle : bbgKey2Bundle.get(bbgKey)) {
        if (identifier == null) {
          s_logger.warn("Unable to get Bloomberg unique ID for {}", bundle);
        }
        
        result.put(bundle, identifier);          
      }
    }
    
    return result;
  }
