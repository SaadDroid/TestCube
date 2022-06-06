public static @Nonnull BgpTopology initBgpTopology(
      Map<String, Configuration> configurations,
      Map<Ip, Map<String, Set<String>>> ipOwners,
      boolean keepInvalid,
      @Nullable Layer2Topology layer2Topology) {
    return initBgpTopology(configurations, ipOwners, keepInvalid, false, null, layer2Topology);
  }
