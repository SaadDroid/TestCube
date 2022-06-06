@VisibleForTesting
  @Nullable
  static TransitGatewayWithMetadata findOriginalGateway(
      Collection<TransitGatewayWithMetadata> tgws) {
    checkArgument(!tgws.isEmpty());
    checkArgument(
        tgws.stream().map(TransitGatewayWithMetadata::getTransitGatewayId).distinct().count() == 1);
    if (tgws.size() == 1) {
      // Short circuit if there is no de-duplication to do.
      return tgws.iterator().next();
    }
    return tgws.stream().filter(TransitGatewayWithMetadata::isOriginal).findFirst().orElse(null);
  }
