@Override
  public GraphCollectionLayout<TemporalGraphHead, TemporalVertex, TemporalEdge> fromGraphLayout(
    LogicalGraphLayout<TemporalGraphHead, TemporalVertex, TemporalEdge> logicalGraphLayout) {
    return fromDataSets(
      logicalGraphLayout.getGraphHead(),
      logicalGraphLayout.getVertices(),
      logicalGraphLayout.getEdges());
  }
