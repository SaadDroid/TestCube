public Container getContainer(String networkName) {
    Optional<NetworkId> networkIdOpt = _idManager.getNetworkId(networkName);
    checkArgument(networkIdOpt.isPresent(), "Network '%s' does not exist", networkName);
    SortedSet<String> testrigs =
        ImmutableSortedSet.copyOf(_idManager.listSnapshots(networkIdOpt.get()));
    return Container.of(networkName, testrigs);
  }
