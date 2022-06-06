@Override
public GraphCollection fromGraphs(
  LogicalGraphLayout<EPGMGraphHead, EPGMVertex, EPGMEdge>... logicalGraphLayouts) {
    if (logicalGraphLayouts.length != 0) {
      DataSet<EPGMGraphHead> graphHeads = null;
      DataSet<EPGMVertex> vertices = null;
      DataSet<EPGMEdge> edges = null;

      if (logicalGraphLayouts.length == 1) {
        return fromGraph(logicalGraphLayouts[0]);
      }

      for (LogicalGraphLayout<EPGMGraphHead, EPGMVertex, EPGMEdge> logicalGraph : logicalGraphLayouts) {
        graphHeads = (graphHeads == null) ?
          logicalGraph.getGraphHead() : graphHeads.union(logicalGraph.getGraphHead());
        vertices = (vertices == null) ?
          logicalGraph.getVertices() : vertices.union(logicalGraph.getVertices());
        edges = (edges == null) ?
          logicalGraph.getEdges() : edges.union(logicalGraph.getEdges());
      }
      return fromDataSets(
        graphHeads.distinct(new Id<>()),
        vertices.distinct(new Id<>()),
        edges.distinct(new Id<>()));
    }
    return createEmptyCollection();
  }
