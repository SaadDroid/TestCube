public PeerPool getPool(final NodeId nodeId) {
    return knownSources.getOrDefault(nodeId, DEFAULT_POOL);
  }
