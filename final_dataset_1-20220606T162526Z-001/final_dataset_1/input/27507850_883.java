@Override
  public Set<RoutingPolicy> resolve(String node, SpecifierContext ctxt) {
    return ctxt.getConfigs().values().stream()
        .filter(c -> c.getHostname().equalsIgnoreCase(node))
        .map(c -> c.getRoutingPolicies().values())
        .flatMap(Collection::stream)
        .filter(f -> _pattern.matcher(f.getName()).find())
        .collect(ImmutableSet.toImmutableSet());
  }
