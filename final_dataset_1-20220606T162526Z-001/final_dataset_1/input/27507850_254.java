@Nonnull
  @VisibleForTesting
  OspfExternalType1Route.Builder transformType1RouteOnImport(
      OspfExternalType1Route route, Ip nextHopIp, long incrementalCost) {
    return transformType1and2CommonOnImport(route, nextHopIp)
        // For type 1 routes both cost to advertiser and metric get incremented
        .setCostToAdvertiser(route.getCostToAdvertiser() + incrementalCost)
        .setMetric(route.getMetric() + incrementalCost);
  }
