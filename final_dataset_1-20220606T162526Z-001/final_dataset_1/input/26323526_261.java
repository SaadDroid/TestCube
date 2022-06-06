@Override
  public DataSet<String> execute(GC collection) {

    // 1-10.
    DataSet<GraphHeadString> graphHeadLabels = getGraphHeadStrings(collection);

    // 11. add empty head to prevent empty result for empty collection

    graphHeadLabels = graphHeadLabels
      .union(collection
        .getConfig()
        .getExecutionEnvironment()
        .fromElements(new GraphHeadString(GradoopId.get(), "")));

    // 12. label collection

    return graphHeadLabels
      .reduceGroup(new ConcatGraphHeadStrings());
  }
