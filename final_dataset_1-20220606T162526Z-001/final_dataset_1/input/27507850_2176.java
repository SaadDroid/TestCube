@VisibleForTesting
  static @Nonnull Stream<Layer2Edge> computeVniInterNodeEdges(VxlanTopology vxlanTopology) {
    return vxlanTopology.getGraph().edges().stream().flatMap(TopologyUtil::toVniVniEdges);
  }
