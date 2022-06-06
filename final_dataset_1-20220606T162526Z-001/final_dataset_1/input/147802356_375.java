public int getRandomlySelectedPeersToAdd(final int currentRandomlySelectedPeerCount) {
    return currentRandomlySelectedPeerCount < minimumRandomlySelectedPeerCount
        ? minimumRandomlySelectedPeerCount - currentRandomlySelectedPeerCount
        : 0;
  }
