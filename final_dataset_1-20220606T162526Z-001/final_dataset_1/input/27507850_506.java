@VisibleForTesting
  org.batfish.representation.cumulus.Interface convertInterface(InterfacesInterface iface) {
    checkArgument(isInterface(iface), "input is not an interface");
    checkArgument(!iface.getName().equals(BRIDGE_NAME), "interface bridge is handled separately");
    String name = iface.getName();
    org.batfish.representation.cumulus.Interface vsIface =
        new org.batfish.representation.cumulus.Interface(
            name,
            getInterfaceType(iface),
            getSuperInterfaceName(iface.getName()),
            getEncapsulationVlan(iface));
    vsIface.setAlias(iface.getDescription());
    vsIface.setBridgeSettings(iface.getBridgeSettings());
    vsIface.setClagSettings(iface.getClagSettings());
    vsIface.getIpAddresses().addAll(firstNonNull(iface.getAddresses(), ImmutableList.of()));
    vsIface.setSpeed(iface.getLinkSpeed());
    vsIface.setVrf(iface.getVrf());
    iface.getPostUpIpRoutes().forEach(vsIface::addPostUpIpRoute);
    return vsIface;
  }
