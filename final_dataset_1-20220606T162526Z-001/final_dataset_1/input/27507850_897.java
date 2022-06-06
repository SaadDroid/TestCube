@Override
  public Set<String> resolve(SpecifierContext ctxt) {
    return ctxt.getConfigs().values().stream()
        .filter(c -> _types.contains(c.getDeviceType()))
        .map(Configuration::getHostname)
        .collect(ImmutableSet.toImmutableSet());
  }
