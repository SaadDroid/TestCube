@Override
  public void chainHeadUpdated(
      final UInt64 slot,
      final Bytes32 stateRoot,
      final Bytes32 bestBlockRoot,
      final boolean epochTransition,
      final Optional<ReorgContext> optionalReorgContext) {
    optionalReorgContext.ifPresent(
        reorgContext -> {
          NavigableMap<UInt64, Bytes32> notCanonicalBlockRoots =
              recentChainData.getAncestorsOnFork(
                  reorgContext.getCommonAncestorSlot(), reorgContext.getOldBestBlockRoot());
          NavigableMap<UInt64, Bytes32> nowCanonicalBlockRoots =
              recentChainData.getAncestorsOnFork(
                  reorgContext.getCommonAncestorSlot(), bestBlockRoot);

          processNonCanonicalBlockOperations(notCanonicalBlockRoots.values());
          processCanonicalBlockOperations(nowCanonicalBlockRoots.values());
        });
  }
