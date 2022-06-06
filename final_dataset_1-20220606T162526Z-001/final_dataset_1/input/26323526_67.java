@Override
  public LogicalGraph getLogicalGraph() {

    TypeInformation<K> externalIdType = ((TupleTypeInfo<?>) importVertices
      .getType()).getTypeAt(0);

    LogicalGraphFactory factory = config.getLogicalGraphFactory();

    DataSet<Tuple3<K, GradoopId, EPGMVertex>> vertexTriples = importVertices
      .map(new InitVertex<K>(
        factory.getVertexFactory(), lineagePropertyKey, externalIdType));

    DataSet<EPGMVertex> epgmVertices = vertexTriples
      .map(new Value2Of3<K, GradoopId, EPGMVertex>());

    DataSet<Tuple2<K, GradoopId>> vertexIdPair = vertexTriples
      .map(new Project3To0And1<K, GradoopId, EPGMVertex>());

    DataSet<EPGMEdge> epgmEdges = importEdges
      .join(vertexIdPair)
      .where(1).equalTo(0)
      .with(new InitEdge<K>(
        factory.getEdgeFactory(), lineagePropertyKey, externalIdType))
      .join(vertexIdPair)
      .where(0).equalTo(0)
      .with(new UpdateEdge<EPGMEdge, K>());

    return factory.fromDataSets(epgmVertices, epgmEdges);
  }
