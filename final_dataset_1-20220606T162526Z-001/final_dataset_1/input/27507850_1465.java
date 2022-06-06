@VisibleForTesting
  static OspfSessionStatus getSessionStatus(
      OspfNeighborConfigId localConfigId,
      OspfNeighborConfigId remoteConfigId,
      NetworkConfigurations configurations) {
    OspfNeighborConfig localConfig =
        configurations.getOspfNeighborConfig(localConfigId).orElse(null);
    OspfNeighborConfig remoteConfig =
        configurations.getOspfNeighborConfig(remoteConfigId).orElse(null);
    OspfProcess localProcess = configurations.getOspfProcess(localConfigId).orElse(null);
    OspfProcess remoteProcess = configurations.getOspfProcess(remoteConfigId).orElse(null);
    Interface localIface =
        configurations
            .getInterface(localConfigId.getHostname(), localConfigId.getInterfaceName())
            .orElse(null);
    Interface remoteIface =
        configurations
            .getInterface(remoteConfigId.getHostname(), remoteConfigId.getInterfaceName())
            .orElse(null);

    if (localProcess == null || remoteProcess == null) {
      return OspfSessionStatus.PROCESS_INVALID;
    }

    if (localConfig == null || remoteConfig == null || localIface == null || remoteIface == null) {
      // This probably shouldn't ever happen...but handle it just in case
      return OspfSessionStatus.UNKNOWN_COMPATIBILITY_ISSUE;
    }

    long localAreaNum = localConfig.getArea();
    long remoteAreaNum = remoteConfig.getArea();
    OspfArea localArea = localProcess.getAreas().get(localAreaNum);
    OspfArea remoteArea = remoteProcess.getAreas().get(remoteAreaNum);
    if (localArea == null || remoteArea == null) {
      return OspfSessionStatus.AREA_INVALID;
    }

    if (localConfig.isPassive() && remoteConfig.isPassive()) {
      return OspfSessionStatus.NO_SESSION;
    }

    if (localConfig.isPassive() != remoteConfig.isPassive()) {
      return OspfSessionStatus.PASSIVE_MISMATCH;
    }
    if (localAreaNum != remoteAreaNum) {
      return OspfSessionStatus.AREA_MISMATCH;
    }
    if (localProcess.getRouterId().equals(remoteProcess.getRouterId())) {
      return OspfSessionStatus.DUPLICATE_ROUTER_ID;
    }
    if (localArea.getStubType() != remoteArea.getStubType()) {
      return OspfSessionStatus.AREA_TYPE_MISMATCH;
    }

    // Optimistically assume unspecified network types match and therefore are compatible
    OspfNetworkType localNetworkType = localIface.getOspfNetworkType();
    OspfNetworkType remoteNetworkType = remoteIface.getOspfNetworkType();
    if ((localNetworkType != null && remoteNetworkType != null)
        && (localNetworkType != remoteNetworkType)) {
      return OspfSessionStatus.NETWORK_TYPE_MISMATCH;
    }

    OspfInterfaceSettings localOspf = localIface.getOspfSettings();
    OspfInterfaceSettings remoteOspf = remoteIface.getOspfSettings();
    // Guaranteed by initNeighborConfigs
    assert (localOspf != null);
    assert (remoteOspf != null);
    if (localOspf.getHelloInterval() != remoteOspf.getHelloInterval()) {
      return OspfSessionStatus.HELLO_INTERVAL_MISMATCH;
    }
    if (localOspf.getDeadInterval() != remoteOspf.getDeadInterval()) {
      return OspfSessionStatus.DEAD_INTERVAL_MISMATCH;
    }

    if (!checkNBMANeighorValidation(localOspf, remoteConfigId.getAddress().getIp())) {
      return OspfSessionStatus.NO_SESSION;
    }
    /*
     * TODO: check MTU matches; This is complicated because frame/packet MTU support not fully there
     * TODO: check reachability (Make sure ACLs/ARP allow communication)
     * TODO: take into account adjacency types (multi-access/p2p/p2mp, broadcast/non-broadcast) when
     * supported
     */

    return OspfSessionStatus.ESTABLISHED;
  }
