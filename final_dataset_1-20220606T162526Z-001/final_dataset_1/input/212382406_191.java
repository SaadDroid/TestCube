public static String buildServiceNameForToken(
      @Nonnull OzoneConfiguration configuration, @Nonnull String serviceId,
      @Nonnull Collection<String> omNodeIds) {
    StringBuilder rpcAddress = new StringBuilder();

    int nodesLength = omNodeIds.size();
    int counter = 0;
    for (String nodeId : omNodeIds) {
      counter++;
      String rpcAddrKey = OmUtils.addKeySuffixes(OZONE_OM_ADDRESS_KEY,
          serviceId, nodeId);
      String rpcAddrStr = OmUtils.getOmRpcAddress(configuration, rpcAddrKey);
      if (rpcAddrStr == null || rpcAddrStr.isEmpty()) {
        throw new IllegalArgumentException("Could not find rpcAddress for " +
            OZONE_OM_ADDRESS_KEY + "." + serviceId + "." + nodeId);
      }

      if (counter != nodesLength) {
        rpcAddress.append(SecurityUtil.buildTokenService(
            NetUtils.createSocketAddr(rpcAddrStr)) + ",");
      } else {
        rpcAddress.append(SecurityUtil.buildTokenService(
            NetUtils.createSocketAddr(rpcAddrStr)));
      }
    }
    return rpcAddress.toString();
  }
