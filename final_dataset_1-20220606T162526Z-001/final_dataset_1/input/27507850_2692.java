@VisibleForTesting
  static Multiset<Row> getEigrpEdges(
      Set<String> includeNodes, Set<String> includeRemoteNodes, EigrpTopology eigrpTopology) {
    return eigrpTopology.getNetwork().edges().stream()
        .filter(
            eigrpEdge ->
                includeNodes.contains(eigrpEdge.getNode1().getHostname())
                    && includeRemoteNodes.contains(eigrpEdge.getNode2().getHostname()))
        .map(EdgesAnswerer::eigrpEdgeToRow)
        .collect(Collectors.toCollection(HashMultiset::create));
  }
