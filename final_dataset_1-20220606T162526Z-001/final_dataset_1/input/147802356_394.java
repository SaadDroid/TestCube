public SafeFuture<Peer> connect(final MultiaddrPeerAddress peer, final Network network) {
    return pendingConnections.computeIfAbsent(peer.getId(), __ -> doConnect(peer, network));
  }
