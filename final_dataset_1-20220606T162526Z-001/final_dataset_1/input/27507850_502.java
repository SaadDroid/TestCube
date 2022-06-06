@VisibleForTesting
  static Bond convertBond(InterfacesInterface bondIface) {
    Bond bond = new Bond(bondIface.getName());
    bond.setClagId(bondIface.getClagId());
    bond.setSlaves(bondIface.getBondSlaves());
    bond.setVrf(bondIface.getVrf());
    InterfaceBridgeSettings bridgeSettings = bondIface.getBridgeSettings();
    if (bridgeSettings != null) {
      InterfaceBridgeSettings bridge = bond.getBridge();
      bridge.setVids(bridgeSettings.getVids());
      Optional.ofNullable(bridgeSettings.getAccess()).ifPresent(bridge::setAccess);
      Optional.ofNullable(bridgeSettings.getPvid()).ifPresent(bridge::setPvid);
    }
    return bond;
  }
