@VisibleForTesting
  static void addBgpPeerToIsp(
      BgpPeerConfig remotePeerConfig, String localInterfaceName, BgpProcess bgpProcess) {
    BgpPeerConfig.Builder<?, ?> ispPeerConfig =
        remotePeerConfig instanceof BgpActivePeerConfig
            ? BgpActivePeerConfig.builder()
                .setPeerAddress(remotePeerConfig.getLocalIp())
                .setLocalIp(((BgpActivePeerConfig) remotePeerConfig).getPeerAddress())
            : BgpUnnumberedPeerConfig.builder()
                .setPeerInterface(localInterfaceName)
                .setLocalIp(LINK_LOCAL_IP);

    ispPeerConfig
        .setRemoteAs(
            firstNonNull(remotePeerConfig.getConfederationAsn(), remotePeerConfig.getLocalAs()))
        .setLocalAs(remotePeerConfig.getRemoteAsns().least())
        .setIpv4UnicastAddressFamily(
            Ipv4UnicastAddressFamily.builder()
                .setExportPolicy(EXPORT_POLICY_ON_ISP_TO_CUSTOMERS)
                .build())
        .setBgpProcess(bgpProcess)
        .build();
  }
