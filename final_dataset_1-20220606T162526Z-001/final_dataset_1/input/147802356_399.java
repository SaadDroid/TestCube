public static Multiaddr fromDiscoveryPeer(final DiscoveryPeer peer) {
    return fromInetSocketAddress(peer.getNodeAddress(), getNodeId(peer));
  }
