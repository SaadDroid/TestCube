@VisibleForTesting
  static void populateIspModels(
      @Nonnull Configuration remoteCfg,
      @Nonnull Set<String> remoteInterfaces,
      @Nonnull List<Ip> remoteIps,
      @Nonnull List<Long> remoteAsnsList,
      @Nonnull List<IspNodeInfo> ispNodeInfos,
      Map<Long, IspModel> allIspModels,
      @Nonnull Warnings warnings) {

    Set<Ip> remoteIpsSet = ImmutableSet.copyOf(remoteIps);
    LongSpace remoteAsns =
        remoteAsnsList.isEmpty()
            ? ALL_AS_NUMBERS
            : LongSpace.builder().includingAll(remoteAsnsList).build();

    Map<String, Interface> lowerCasedInterfaces =
        remoteCfg.getAllInterfaces().entrySet().stream()
            .collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(), Entry::getValue));

    for (String remoteIfaceName : remoteInterfaces) {
      Interface remoteIface = lowerCasedInterfaces.get(remoteIfaceName.toLowerCase());
      if (remoteIface == null) {
        warnings.redFlag(
            String.format(
                "ISP Modeling: Cannot find interface %s on node %s",
                remoteIfaceName, remoteCfg.getHostname()));
        continue;
      }
      // collecting InterfaceAddresses for interfaces
      Map<Ip, InterfaceAddress> ipToInterfaceAddresses =
          remoteIface.getAllAddresses().stream()
              .collect(
                  ImmutableMap.toImmutableMap(
                      addr ->
                          addr instanceof ConcreteInterfaceAddress
                              ? ((ConcreteInterfaceAddress) addr).getIp()
                              : ((LinkLocalAddress) addr).getIp(),
                      Function.identity()));

      List<BgpPeerConfig> validRemoteBgpPeerConfigs =
          remoteCfg.getVrfs().values().stream()
              .map(Vrf::getBgpProcess)
              .filter(Objects::nonNull)
              .flatMap(
                  bgpProcess ->
                      Streams.concat(
                          bgpProcess.getActiveNeighbors().values().stream(),
                          bgpProcess.getInterfaceNeighbors().values().stream()))
              .filter(
                  bgpPeerConfig ->
                      isValidBgpPeerConfig(
                          bgpPeerConfig, ipToInterfaceAddresses.keySet(), remoteIpsSet, remoteAsns))
              .collect(Collectors.toList());

      if (validRemoteBgpPeerConfigs.isEmpty()) {
        warnings.redFlag(
            String.format(
                "ISP Modeling: Cannot find any valid eBGP configurations for interface %s on node %s",
                remoteIfaceName, remoteCfg.getHostname()));
        continue;
      }
      for (BgpPeerConfig bgpPeerConfig : validRemoteBgpPeerConfigs) {
        long asn = bgpPeerConfig.getRemoteAsns().least();
        List<IspNodeInfo> matchingInfos =
            ispNodeInfos.stream().filter(i -> i.getAsn() == asn).collect(Collectors.toList());

        // For properties that can't be merged, pick the first one.
        @Nullable
        String ispName = matchingInfos.stream().map(IspNodeInfo::getName).findFirst().orElse(null);
        IspTrafficFiltering filtering =
            matchingInfos.stream()
                .map(IspNodeInfo::getIspTrafficFiltering)
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(IspTrafficFiltering.blockReservedAddressesAtInternet());

        // Merge the sets of additional announcements to internet is merging their prefixes
        Set<Prefix> additionalPrefixes =
            matchingInfos.stream()
                .flatMap(
                    i -> i.getAdditionalAnnouncements().stream().map(IspAnnouncement::getPrefix))
                .collect(ImmutableSet.toImmutableSet());
        IspModel ispInfo =
            allIspModels.computeIfAbsent(
                asn,
                k ->
                    IspModel.builder()
                        .setAsn(asn)
                        .setName(ispName)
                        .setAdditionalPrefixesToInternet(additionalPrefixes)
                        .setTrafficFiltering(filtering)
                        .build());
        InterfaceAddress interfaceAddress =
            bgpPeerConfig instanceof BgpActivePeerConfig
                ? ConcreteInterfaceAddress.create(
                    ((BgpActivePeerConfig) bgpPeerConfig).getPeerAddress(),
                    ((ConcreteInterfaceAddress)
                            ipToInterfaceAddresses.get(bgpPeerConfig.getLocalIp()))
                        .getNetworkBits())
                : LINK_LOCAL_ADDRESS;
        ispInfo.addNeighbor(
            new Remote(remoteCfg.getHostname(), remoteIfaceName, interfaceAddress, bgpPeerConfig));
      }
    }
  }
