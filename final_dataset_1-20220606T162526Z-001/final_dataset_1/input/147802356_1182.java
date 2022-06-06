private void importBlock(final SignedBeaconBlock block) {
    recentBlockFetcher.cancelRecentBlockRequest(block.getRoot());
    if (!shouldImportBlock(block)) {
      return;
    }

    blockImporter
        .importBlock(block)
        .thenAccept(
            result -> {
              if (result.isSuccessful()) {
                LOG.trace("Imported block: {}", block);
              } else if (result.getFailureReason() == FailureReason.UNKNOWN_PARENT) {
                // Add to the pending pool so it is triggered once the parent is imported
                pendingBlocks.add(block);
                // Check if the parent was imported while we were trying to import this block
                // and if so, remove from the pendingPool again and process now
                // We must add the block to the pending pool before this check happens
                // to avoid race conditions between performing the check and the parent importing.
                if (recentChainData.containsBlock(block.getParent_root())) {
                  pendingBlocks.remove(block);
                  importBlock(block);
                }
              } else if (result.getFailureReason() == FailureReason.BLOCK_IS_FROM_FUTURE) {
                futureBlocks.add(block);
              } else {
                LOG.trace(
                    "Unable to import block for reason {}: {}", result.getFailureReason(), block);
                dropInvalidBlock(block);
              }
            })
        .reportExceptions();
  }
