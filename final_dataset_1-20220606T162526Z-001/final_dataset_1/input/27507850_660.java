@VisibleForTesting
  static Set<String> getEnabledTargetZones(
      AvailabilityZone instanceZone,
      boolean crossZoneLoadBalancing,
      List<AvailabilityZone> allEnabledZones) {
    return crossZoneLoadBalancing
        ? allEnabledZones.stream()
            .map(zone -> zone.getZoneName())
            .collect(ImmutableSet.toImmutableSet())
        : ImmutableSet.of(instanceZone.getZoneName());
  }
