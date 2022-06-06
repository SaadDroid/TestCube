@Nullable
  @VisibleForTesting
  static IntegerSpace resolvePorts(
      @Nullable IntegerSpace ports, @Nullable Set<Application> applications) {
    @Nullable
    IntegerSpace portsFromApplications =
        firstNonNull(applications, ImmutableSet.of()).stream()
            .filter(application -> application instanceof PortsApplication)
            .flatMap(application -> ((PortsApplication) application).getPorts().stream())
            .map(IntegerSpace::of)
            .reduce(IntegerSpace::union)
            .orElse(null);
    return intersectNullable(ports, portsFromApplications);
  }
