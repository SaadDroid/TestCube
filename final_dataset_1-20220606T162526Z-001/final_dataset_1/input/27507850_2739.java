static @Nonnull ConfiguredSessionStatus getConfiguredStatus(
      BgpPeerConfigId peerId,
      BgpActivePeerConfig activePeerConfig,
      SessionType sessionType,
      Map<Ip, Map<String, Set<String>>> ipVrfOwners,
      ValueGraph<BgpPeerConfigId, BgpSessionProperties> configuredBgpTopology) {
    ConfiguredSessionStatus brokenStatus = getLocallyBrokenStatus(activePeerConfig, sessionType);
    if (brokenStatus != null) {
      return brokenStatus;
    }
    // Nothing blatantly broken so far on the local side, keep checking.
    Ip localIp = activePeerConfig.getLocalIp();
    Ip remoteIp = activePeerConfig.getPeerAddress();

    if (!ipVrfOwners
        .getOrDefault(localIp, ImmutableMap.of())
        .getOrDefault(peerId.getHostname(), ImmutableSet.of())
        .contains(peerId.getVrfName())) {
      return ConfiguredSessionStatus.INVALID_LOCAL_IP;
    } else if (!ipVrfOwners.containsKey(remoteIp)) {
      return ConfiguredSessionStatus.UNKNOWN_REMOTE;
    } else if (configuredBgpTopology.adjacentNodes(peerId).isEmpty()) {
      return ConfiguredSessionStatus.HALF_OPEN;
    } else if (configuredBgpTopology.outDegree(peerId) > 1) {
      return ConfiguredSessionStatus.MULTIPLE_REMOTES;
    }
    return ConfiguredSessionStatus.UNIQUE_MATCH;
  }
