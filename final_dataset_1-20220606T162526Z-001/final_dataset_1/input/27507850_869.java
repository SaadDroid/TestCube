@Override
  public Set<NodeInterfacePair> resolve(Set<String> nodes, SpecifierContext ctxt) {
    return ctxt.getConfigs().values().stream()
        .filter(c -> nodes.contains(c.getHostname()))
        .flatMap(c -> c.getAllInterfaces().values().stream().filter(Interface::getActive))
        .filter(
            i ->
                i.getAllConcreteAddresses().stream().anyMatch(this::interfaceAddressMatchesIpSpace))
        .map(NodeInterfacePair::of)
        .collect(ImmutableSet.toImmutableSet());
  }
