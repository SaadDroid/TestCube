@Override
  public SafeFuture<Optional<SignedBeaconBlock>> retrieveSignedBlock(final Bytes32 blockRoot) {
    if (!containsBlock(blockRoot)) {
      return EmptyStoreResults.EMPTY_SIGNED_BLOCK_FUTURE;
    }
    final Optional<SignedBeaconBlock> inMemoryBlock = getBlockIfAvailable(blockRoot);
    if (inMemoryBlock.isPresent()) {
      return SafeFuture.completedFuture(inMemoryBlock);
    }

    // Retrieve and cache block
    return blockProvider
        .getBlock(blockRoot)
        .thenApply(
            block -> {
              block.ifPresent(this::putBlock);
              return block;
            });
  }
