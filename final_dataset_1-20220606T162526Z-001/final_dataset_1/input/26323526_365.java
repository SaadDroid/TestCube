@Override
  public LogicalGraph toLogicalGraph() {
    final LogicalGraphFactory logicalGraphFactory = getConfig().getLogicalGraphFactory();
    return logicalGraphFactory.fromDataSets(
      getGraphHead().map(new TemporalGraphHeadToGraphHead(logicalGraphFactory.getGraphHeadFactory())),
      getVertices().map(new TemporalVertexToVertex(logicalGraphFactory.getVertexFactory())),
      getEdges().map(new TemporalEdgeToEdge(logicalGraphFactory.getEdgeFactory())));
  }
