@VisibleForTesting
  static void mergeInternetAndIspNodes(
      ModeledNodes modeledNodes,
      Map<String, Configuration> configurations,
      Set<Layer1Edge> layer1Edges,
      Warnings internetWarnings) {
    Map<String, Configuration> modeledConfigs = modeledNodes.getConfigurations();
    Set<String> commonNodes = Sets.intersection(configurations.keySet(), modeledConfigs.keySet());
    if (!commonNodes.isEmpty()) {
      internetWarnings.redFlag(
          String.format(
              "Cannot add internet and ISP nodes because nodes with the following names already exist in the snapshot: %s",
              commonNodes));
      return;
    }
    configurations.putAll(modeledConfigs);
    layer1Edges.addAll(modeledNodes.getLayer1Edges());
  }
