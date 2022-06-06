public static Multiaddr fromDiscoveryPeerAsUdp(final DiscoveryPeer peer) {
    return addPeerId(fromInetSocketAddress(peer.getNodeAddress(), "udp"), getNodeId(peer));
  }
