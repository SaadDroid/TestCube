@CheckReturnValue
  public SafeFuture<BlockImportResult> importBlock(SignedBeaconBlock block) {
    if (recentChainData.containsBlock(block.getMessage().hash_tree_root())) {
      LOG.trace(
          "Importing known block {}.  Return successful result without re-processing.",
          () -> formatBlock(block));
      return SafeFuture.completedFuture(BlockImportResult.knownBlock(block));
    }

    if (!weakSubjectivityValidator.isBlockValid(block, getForkChoiceStrategy())) {
      return SafeFuture.completedFuture(BlockImportResult.FAILED_WEAK_SUBJECTIVITY_CHECKS);
    }

    return validateFinalizedCheckpointIsWithinWeakSubjectivityPeriod()
        .thenCompose(__ -> recentChainData.retrieveBlockState(block.getParent_root()))
        .thenCompose(preState -> forkChoice.onBlock(block, preState))
        .thenApply(
            result -> {
              if (!result.isSuccessful()) {
                LOG.trace(
                    "Failed to import block for reason {}: {}",
                    result::getFailureReason,
                    () -> formatBlock(block));
                return result;
              }
              LOG.trace("Successfully imported block {}", () -> formatBlock(block));

              final Optional<BlockProcessingRecord> record = result.getBlockProcessingRecord();
              eventBus.post(new ImportedBlockEvent(block));

              // Notify operation pools to remove operations only
              // if the block is on our canonical chain
              if (result.isBlockOnCanonicalChain()) {
                notifyBlockOperationSubscribers(block);
              }

              record.ifPresent(eventBus::post);

              return result;
            })
        .exceptionally(
            (e) -> {
              LOG.error("Internal error while importing block: {}", formatBlock(block), e);
              return BlockImportResult.internalError(e);
            });
  }
