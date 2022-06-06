@VisibleForTesting
  static @Nonnull Stream<ExprAclLine> generateVsysSharedGatewayCalls(
      Vsys sharedGateway, Vsys vsys) {
    String sharedGatewayName = sharedGateway.getName();
    return vsys.getZones().values().stream()
        .filter(
            externalToZone ->
                externalToZone.getType() == Type.EXTERNAL
                    && externalToZone.getExternalNames().contains(sharedGatewayName))
        .flatMap(
            externalToZone ->
                vsys.getZones().values().stream()
                    .filter(externalFromZone -> externalFromZone.getType() == Type.LAYER3)
                    .flatMap(
                        externalFromZone ->
                            generateCrossZoneCallsFromLayer3(externalFromZone, externalToZone)));
  }
