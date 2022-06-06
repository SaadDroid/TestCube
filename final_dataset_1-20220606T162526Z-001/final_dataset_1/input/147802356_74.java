@Override
  public SafeFuture<Block> getEth1Block(final UInt64 blockNumber) {
    return queueRequest(() -> delegate.getEth1Block(blockNumber));
  }
