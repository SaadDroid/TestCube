public void add(HDFSBlocksDistribution otherBlocksDistribution) {
    Map<String,HostAndWeight> otherHostAndWeights =
      otherBlocksDistribution.getHostAndWeights();
    for (Map.Entry<String, HostAndWeight> otherHostAndWeight:
      otherHostAndWeights.entrySet()) {
      addHostAndBlockWeight(otherHostAndWeight.getValue().host,
        otherHostAndWeight.getValue().weight);
    }
    addUniqueWeight(otherBlocksDistribution.getUniqueBlocksTotalWeight());
  }
