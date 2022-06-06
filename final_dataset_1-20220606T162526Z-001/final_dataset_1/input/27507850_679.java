@Nullable
  @VisibleForTesting
  Interface connectToVpc(
      Configuration natGwCfg,
      ConvertedConfiguration awsConfiguration,
      Region region,
      Warnings warnings) {

    Vpc vpc = region.getVpcs().get(_vpcId);
    if (vpc == null) {
      warnings.redFlag(
          String.format(
              "VPC %s for NAT gateway %s not found in region %s",
              _vpcId, _natGatewayId, region.getName()));
      return null;
    }

    Configuration vpcCfg = awsConfiguration.getNode(Vpc.nodeName(vpc.getId()));
    if (vpcCfg == null) {
      warnings.redFlag(
          String.format(
              "Configuration for VPC %s not found while building the NAT gateway node %s",
              _vpcId, _natGatewayId));
      return null;
    }

    String vrfNameOnVpc = Vpc.vrfNameForLink(_natGatewayId);

    if (!vpcCfg.getVrfs().containsKey(vrfNameOnVpc)) {
      warnings.redFlag(String.format("VRF %s not found on VPC %s", vrfNameOnVpc, _vpcId));
      return null;
    }

    connect(awsConfiguration, natGwCfg, DEFAULT_VRF_NAME, vpcCfg, vrfNameOnVpc, "");

    addStaticRoute(
        vpcCfg.getVrfs().get(vrfNameOnVpc),
        toStaticRoute(
            Prefix.ZERO,
            Utils.interfaceNameToRemote(natGwCfg),
            Utils.getInterfaceLinkLocalIp(natGwCfg, Utils.interfaceNameToRemote(vpcCfg))));

    return natGwCfg.getAllInterfaces().get(Utils.interfaceNameToRemote(vpcCfg));
  }
