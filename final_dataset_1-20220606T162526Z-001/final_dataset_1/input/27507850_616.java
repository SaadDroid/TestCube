@VisibleForTesting
  static void createBgpProcess(
      Configuration tgwCfg, Vrf vrf, ConvertedConfiguration awsConfiguration) {
    LinkLocalAddress loopbackBgpAddress = LinkLocalAddress.of(LINK_LOCAL_IP);
    Utils.newInterface(
        "bgp-loopback-" + vrf.getName(),
        tgwCfg,
        vrf.getName(),
        loopbackBgpAddress,
        "BGP loopback for " + vrf.getName());

    BgpProcess proc =
        BgpProcess.builder()
            .setRouterId(loopbackBgpAddress.getIp())
            .setVrf(vrf)
            .setAdminCostsToVendorDefaults(ConfigurationFormat.AWS)
            .build();
    // TODO: check if vpn ecmp support setting in transit gateway has an impact here
    proc.setMultipathEquivalentAsPathMatchMode(MultipathEquivalentAsPathMatchMode.EXACT_PATH);

    // TODO: confirm if this is the policy we really want
    RoutingPolicy.builder()
        .setName(bgpExportPolicyName(vrf.getName()))
        .setOwner(tgwCfg)
        .setStatements(Collections.singletonList(ACCEPT_ALL_BGP_AND_STATIC))
        .build();

    RoutingPolicy.builder()
        .setName(bgpImportPolicyName(vrf.getName()))
        .setOwner(tgwCfg)
        .setStatements(Collections.singletonList(ACCEPT_ALL_BGP))
        .build();
  }
