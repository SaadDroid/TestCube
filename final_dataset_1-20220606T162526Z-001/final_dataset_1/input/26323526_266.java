@Override
  public GC execute(GC collection) {
    DataSet<G> graphHeads = getCanonicalLabels(collection)
      .join(collection.getGraphHeads())
      .where(0).equalTo(new Id<>())
      .with(new GraphHeadGroup<>())
      .groupBy(0)
      .reduceGroup(function);

    return selectVerticesAndEdges(collection, graphHeads);
  }
