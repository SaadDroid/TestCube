@VisibleForTesting
  static boolean areProtocolsAndPortsCompatible(
      @Nullable Set<IpProtocol> ipProtocols,
      @Nullable IntegerSpace ports,
      @Nullable Set<Application> applications)
      throws IllegalArgumentException {

    // Ports are only applicable to TCP/UDP
    if (ports != null && ipProtocols != null) {
      checkArgument(
          Sets.difference(ipProtocols, IpProtocol.IP_PROTOCOLS_WITH_PORTS).isEmpty(),
          "Cannot combine given ports (%s) and IP protocols (%s)",
          ports,
          ipProtocols);
    }

    // Intersection of IP protocols and higher level applications should not be empty
    if (ipProtocols != null && applications != null) {
      // Resolve Ip protocols from higher-level application protocols
      Set<IpProtocol> resolvedIpProtocols =
          applications.stream()
              .map(Application::getIpProtocol)
              .collect(ImmutableSet.toImmutableSet());
      checkArgument(
          !Sets.intersection(ipProtocols, resolvedIpProtocols).isEmpty(),
          "Combination of given IP protocols (%s) and application protocols (%s) cannot be satisfied",
          ipProtocols,
          applications);
    }

    // Intersection of ports given and ports resolved from higher-level protocols should
    // not be empty
    if (ports != null && applications != null) {
      IntegerSpace resolvedPorts =
          applications.stream()
              .filter(application -> application instanceof PortsApplication)
              .flatMap(application -> ((PortsApplication) application).getPorts().stream())
              .map(IntegerSpace::of)
              .reduce(IntegerSpace::union)
              .orElse(IntegerSpace.EMPTY);

      checkArgument(
          !ports.intersection(resolvedPorts).isEmpty(),
          "Given ports (%s) and applications (%s) do not overlap",
          ports,
          applications);
    }
    return true;
  }
