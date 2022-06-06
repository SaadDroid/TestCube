@VisibleForTesting
  static void connectSenderReceiver(
      TransitGatewayAttachment sendSideAttachment,
      TransitGatewayAttachment recvSideAttachment,
      AwsConfiguration vsConfigs,
      ConvertedConfiguration viConfigs,
      Warnings warnings) {
    Configuration sendSideTgw = viConfigs.getNode(sendSideAttachment.getGatewayId());
    if (sendSideTgw == null) {
      warnings.redFlag(
          String.format("Configuration not found for TGW %s", sendSideAttachment.getGatewayId()));
      return;
    }

    Configuration recvSideTgw = viConfigs.getNode(recvSideAttachment.getGatewayId());
    if (recvSideTgw == null) {
      warnings.redFlag(
          String.format("Configuration not found for TGW %s", recvSideAttachment.getGatewayId()));
      return;
    }

    String associatedRouteTableId =
        recvSideAttachment.getAssociation() == null
            ? null
            : recvSideAttachment.getAssociation().getRouteTableId();
    if (associatedRouteTableId == null) {
      warnings.redFlag(
          String.format(
              "No route table associated for peering attachment %s on TGW %s",
              recvSideAttachment.getId(), recvSideAttachment.getGatewayId()));
      return;
    }

    List<Region> sendSideRegions =
        vsConfigs.getAccounts().stream()
            .filter(a -> a.getId().equals(sendSideAttachment.getGatewayOwnerId()))
            .flatMap(a -> a.getRegions().stream())
            .filter(r -> r.getTransitGateways().containsKey(sendSideAttachment.getGatewayId()))
            .collect(ImmutableList.toImmutableList());
    if (sendSideRegions.isEmpty()) {
      warnings.redFlag(
          String.format(
              "TGW %s not found in any region of account %s",
              sendSideAttachment.getGatewayId(), sendSideAttachment.getGatewayOwnerId()));
      return;
    }
    if (sendSideRegions.size() > 1) {
      warnings.redFlag(
          String.format(
              "TGW %s found in multiple regions for account %s. Skipping its peering attachments.",
              sendSideAttachment.getGatewayId(), sendSideAttachment.getGatewayOwnerId()));
      return;
    }

    // find the route tables on the send side
    Set<TransitGatewayRouteTable> sendSideRouteTables =
        sendSideRegions.get(0).getTransitGatewayRouteTables().values().stream()
            .filter(
                routeTable -> routeTable.getGatewayId().equals(sendSideAttachment.getGatewayId()))
            .collect(ImmutableSet.toImmutableSet());

    sendSideRouteTables.forEach(
        rt -> {
          Interface sendSideIface =
              sendSideTgw
                  .getAllInterfaces()
                  .get(sendSidePeeringInterfaceName(rt.getId(), sendSideAttachment.getId()));
          if (sendSideIface == null) {
            warnings.redFlag(
                String.format(
                    "Interface for route table %s for peering attachment %s on TGW %s not found",
                    rt.getId(), sendSideAttachment.getId(), sendSideAttachment.getGatewayId()));
            return;
          }

          // create an interface on the receive side in the right VRF
          Interface recvSideIface =
              Utils.newInterface(
                  receiveSidePeeringInterfaceName(
                      rt.getId(), recvSideAttachment.getId(), associatedRouteTableId),
                  recvSideTgw,
                  vrfNameForRouteTable(associatedRouteTableId),
                  LinkLocalAddress.of(LINK_LOCAL_IP),
                  "From " + recvSideAttachment.getResourceId());

          Utils.addLayer1Edge(
              viConfigs,
              sendSideTgw.getHostname(),
              sendSideIface.getName(),
              recvSideTgw.getHostname(),
              recvSideIface.getName());
        });
  }
