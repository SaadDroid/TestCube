@VisibleForTesting
  static Multiset<IpsecSessionInfo> rawAnswer(
      NetworkConfigurations networkConfigurations,
      ValueGraph<IpsecPeerConfigId, IpsecSession> ipsecTopology,
      Set<String> initiatorNodes,
      Set<String> responderNodes) {
    Multiset<IpsecSessionInfo> ipsecSessionInfos = HashMultiset.create();

    for (IpsecPeerConfigId node : ipsecTopology.nodes()) {
      IpsecPeerConfig ipsecPeerConfig = networkConfigurations.getIpsecPeerConfig(node);
      if (ipsecPeerConfig == null
          || ipsecPeerConfig instanceof IpsecDynamicPeerConfig
          || !initiatorNodes.contains(node.getHostName())) {
        continue;
      }
      IpsecSessionInfo.Builder ipsecSessionInfoBuilder = IpsecSessionInfo.builder();

      ipsecSessionInfoBuilder.setInitiatorHostname(node.getHostName());
      ipsecSessionInfoBuilder.setInitiatorInterface(ipsecPeerConfig.getSourceInterface());
      ipsecSessionInfoBuilder.setInitiatorIp(ipsecPeerConfig.getLocalAddress());
      ipsecSessionInfoBuilder.setInitiatorTunnelInterface(ipsecPeerConfig.getTunnelInterface());

      Set<IpsecPeerConfigId> neighbors = ipsecTopology.adjacentNodes(node);

      if (neighbors.isEmpty()) {
        ipsecSessionInfoBuilder.setIpsecSessionStatus(MISSING_END_POINT);
        ipsecSessionInfos.add(ipsecSessionInfoBuilder.build());
        continue;
      }

      for (IpsecPeerConfigId neighbor : neighbors) {
        if (!responderNodes.contains(neighbor.getHostName())) {
          continue;
        }
        IpsecSession ipsecSession = ipsecTopology.edgeValueOrDefault(node, neighbor, null);
        if (ipsecSession == null) {
          continue;
        }
        IpsecPeerConfig ipsecPeerConfigNeighbor =
            networkConfigurations.getIpsecPeerConfig(neighbor);
        if (ipsecPeerConfigNeighbor == null) {
          continue;
        }
        processNeighbor(neighbor, ipsecSessionInfoBuilder, ipsecPeerConfigNeighbor, ipsecSession);
        ipsecSessionInfos.add(ipsecSessionInfoBuilder.build());
      }
    }
    return ipsecSessionInfos;
  }
