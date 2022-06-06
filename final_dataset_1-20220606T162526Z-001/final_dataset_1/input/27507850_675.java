static void createBackboneConnection(Configuration cfgNode, Vrf vrf, String exportPolicyName) {
    Utils.newInterface(
        BACKBONE_FACING_INTERFACE_NAME,
        cfgNode,
        vrf.getName(),
        LinkLocalAddress.of(LINK_LOCAL_IP),
        "To AWS backbone");
    BgpProcess bgpProcess =
        BgpProcess.builder()
            .setRouterId(LINK_LOCAL_IP)
            .setVrf(vrf)
            .setAdminCostsToVendorDefaults(ConfigurationFormat.AWS)
            .build();
    BgpUnnumberedPeerConfig.builder()
        .setPeerInterface(BACKBONE_FACING_INTERFACE_NAME)
        .setRemoteAs(AWS_BACKBONE_ASN)
        .setLocalIp(LINK_LOCAL_IP)
        .setLocalAs(BACKBONE_PEERING_ASN)
        .setBgpProcess(bgpProcess)
        .setIpv4UnicastAddressFamily(
            Ipv4UnicastAddressFamily.builder().setExportPolicy(exportPolicyName).build())
        .build();
  }
