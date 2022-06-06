private LG edgeInducedSubgraphProjectFirst(LG superGraph) {
    DataSet<E> filteredEdges = superGraph.getEdges().filter(edgeFilterFunction);
    DataSet<V> inducedVertices = filteredEdges
      .flatMap(new EdgeToSourceAndTargetId<>())
      .distinct()
      .join(superGraph.getVertices())
      .where("*").equalTo(new Id<>())
      .with(new RightSide<>());

    return superGraph.getFactory()
      .fromDataSets(superGraph.getGraphHead(), inducedVertices, filteredEdges);
  }
