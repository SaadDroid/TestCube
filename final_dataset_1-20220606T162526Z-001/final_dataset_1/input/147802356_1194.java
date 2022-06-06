public SafeFuture<UInt64> getCommonAncestor(
      final Eth2Peer peer, final PeerStatus status, final UInt64 firstNonFinalSlot) {
    final UInt64 lowestHeadSlot = storageClient.getHeadSlot().min(status.getHeadSlot());
    if (lowestHeadSlot.isLessThan(firstNonFinalSlot.plus(OPTIMISTIC_HISTORY_LENGTH))) {
      return SafeFuture.completedFuture(firstNonFinalSlot);
    }

    final UInt64 localNonFinalisedSlotCount = lowestHeadSlot.minus(firstNonFinalSlot);
    final UInt64 firstRequestedSlot = lowestHeadSlot.minus(OPTIMISTIC_HISTORY_LENGTH);
    final UInt64 lastSlot = firstRequestedSlot.plus(MAX_BLOCK_RANGE);

    LOG.debug(
        "Local head slot {}. Have {} non finalized slots, "
            + "will sample ahead every {} slots from {} to {}. Peer head is {}",
        storageClient.getHeadSlot(),
        localNonFinalisedSlotCount,
        SAMPLE_RATE,
        firstRequestedSlot,
        lastSlot,
        status.getHeadSlot());

    final BestBlockListener blockListener = new BestBlockListener(storageClient, firstNonFinalSlot);
    final PeerSyncBlockRequest request =
        new PeerSyncBlockRequest(SafeFuture.COMPLETE, lastSlot, blockListener);

    return peer.requestBlocksByRange(firstRequestedSlot, BLOCK_COUNT, SAMPLE_RATE, request)
        .thenApply(__ -> blockListener.getBestSlot());
  }
