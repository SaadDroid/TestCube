@Override
  public LogicalGraph execute(LogicalGraph searchGraph, LogicalGraph graphPatterns) {
    return execute(searchGraph,
        graphPatterns.getCollectionFactory()
        .fromDataSets(
            graphPatterns.getGraphHead(),
            graphPatterns.getVertices(),
            graphPatterns.getEdges()));
  }
