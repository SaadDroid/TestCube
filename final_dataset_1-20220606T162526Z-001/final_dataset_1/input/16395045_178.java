public PairOfSameType<HRegion> execute(final Server server,
      final RegionServerServices services)
  throws IOException {
    PairOfSameType<HRegion> regions = createDaughters(server, services);
    openDaughters(server, services, regions.getFirst(), regions.getSecond());
    transitionZKNode(server, services, regions.getFirst(), regions.getSecond());
    return regions;
  }
