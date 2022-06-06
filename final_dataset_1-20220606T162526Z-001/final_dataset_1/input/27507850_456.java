@VisibleForTesting
  static @Nonnull IpAccessList generateOutgoingFilter(
      Zone toZone, Collection<Vsys> sharedGateways, Collection<Vsys> virtualSystems) {
    Vsys vsys = toZone.getVsys();
    List<AclLine> lines =
        vsys.getZones().values().stream()
            .flatMap(
                fromZone ->
                    generateCrossZoneCalls(fromZone, toZone, sharedGateways, virtualSystems))
            .collect(ImmutableList.toImmutableList());
    return IpAccessList.builder()
        .setName(computeOutgoingFilterName(computeObjectName(vsys.getName(), toZone.getName())))
        .setLines(lines)
        .build();
  }
