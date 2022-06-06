@VisibleForTesting
  static @Nonnull Stream<ExprAclLine> generateInterVsysCrossZoneCalls(
      Zone fromZone, Zone toZone, Vsys externalVsys) {
    Vsys vsys = fromZone.getVsys();
    assert vsys == toZone.getVsys() && vsys != externalVsys; // sanity check
    String vsysName = vsys.getName();
    return externalVsys.getZones().values().stream()
        .filter(
            externalVsysToZone ->
                externalVsysToZone.getType() == Type.EXTERNAL
                    && externalVsysToZone.getExternalNames().contains(vsysName))
        .flatMap(
            externalVsysToZone ->
                externalVsys.getZones().values().stream()
                    .filter(externalVsysFromZone -> externalVsysFromZone.getType() == Type.LAYER3)
                    .flatMap(
                        externalVsysFromZone ->
                            generateDoubleCrossZoneCalls(
                                fromZone, toZone, externalVsysFromZone, externalVsysToZone)));
  }
