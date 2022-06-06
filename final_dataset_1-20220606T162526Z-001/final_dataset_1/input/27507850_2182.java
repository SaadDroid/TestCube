public static @Nonnull Topology computeLayer3Topology(
      Topology rawLayer3Topology, Set<Edge> overlayEdges) {
    return new Topology(
        ImmutableSortedSet.<Edge>naturalOrder()
            .addAll(rawLayer3Topology.getEdges())
            .addAll(overlayEdges)
            .build());
  }
