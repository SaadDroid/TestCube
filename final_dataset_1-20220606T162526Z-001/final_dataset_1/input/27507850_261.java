@Nonnull
  @VisibleForTesting
  <T extends OspfExternalRoute> Stream<RouteAdvertisement<T>> filterExternalRoutesOnExport(
      RibDelta<T> delta, OspfArea areaConfig) {
    // No external routes can propagate into a stub area
    if (areaConfig.getStubType() == StubType.STUB) {
      return Stream.of();
    }

    // If we're an ABR, do not propagate external routes to NSSAs that suppresses type 7 LSAs
    if (isABR()
        && areaConfig.getNssa() != null
        && areaConfig.getNssa().getSuppressType7()
        && areaConfig.getStubType() == StubType.NSSA) {
      return Stream.of();
    }

    return delta.getActions();
  }
