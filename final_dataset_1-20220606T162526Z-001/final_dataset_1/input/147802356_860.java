@Override
  public void onEth1Block(final Bytes32 blockHash, final UInt64 blockTimestamp) {
    eth1DataCache.onEth1Block(blockHash, blockTimestamp);
  }
