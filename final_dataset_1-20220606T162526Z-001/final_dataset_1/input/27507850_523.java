private @Nonnull org.batfish.datamodel.Interface toInterface(Bond bond) {
    String name = bond.getName();
    org.batfish.datamodel.Interface newIface =
        org.batfish.datamodel.Interface.builder()
            .setName(name)
            .setOwner(_c)
            .setType(InterfaceType.AGGREGATED)
            .build();

    bond.getSlaves().forEach(slave -> _c.getAllInterfaces().get(slave).setChannelGroup(name));
    newIface.setChannelGroupMembers(bond.getSlaves());
    newIface.setDependencies(
        bond.getSlaves().stream()
            .map(slave -> new Dependency(slave, DependencyType.AGGREGATE))
            .collect(ImmutableSet.toImmutableSet()));

    applyBridgeSettings(bond.getBridge(), newIface);

    newIface.setActive(true);
    if (!bond.getIpAddresses().isEmpty()) {
      newIface.setAddress(bond.getIpAddresses().get(0));
    }
    newIface.setAllAddresses(bond.getIpAddresses());

    newIface.setMlagId(bond.getClagId());

    return newIface;
  }
