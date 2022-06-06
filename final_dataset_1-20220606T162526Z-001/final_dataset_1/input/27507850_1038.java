@Override
  public Set<NodeInterfacePair> resolve(Set<String> nodes, SpecifierContext ctxt) {
    return ctxt.getConfigs().values().stream()
        .filter(c -> nodes.contains(c.getHostname()))
        .map(c -> c.getAllInterfaces().values())
        .flatMap(Collection::stream)
        .filter(iface -> _pattern.matcher(iface.getName()).find())
        .map(NodeInterfacePair::of)
        .collect(ImmutableSet.toImmutableSet());
  }
