@VisibleForTesting
  static @Nonnull Stream<ExprAclLine> generateCrossZoneCallsFromExternal(
      Zone fromZone,
      Zone toZone,
      Collection<Vsys> sharedGateways,
      Collection<Vsys> virtualSystems) {
    Vsys vsys = fromZone.getVsys();
    assert fromZone.getVsys() == toZone.getVsys(); // sanity check
    Stream<ExprAclLine> vsysLines =
        virtualSystems.stream()
            .filter(not(equalTo(vsys)))
            .filter(externalVsys -> fromZone.getExternalNames().contains(externalVsys.getName()))
            .flatMap(
                externalVsys -> generateInterVsysCrossZoneCalls(fromZone, toZone, externalVsys));
    Stream<ExprAclLine> sgLines =
        sharedGateways.stream()
            .filter(sharedGateway -> fromZone.getExternalNames().contains(sharedGateway.getName()))
            .flatMap(
                sharedGateway ->
                    generatedSharedGatewayVsysCrossZoneCalls(fromZone, toZone, sharedGateway));
    return Stream.concat(vsysLines, sgLines);
  }
