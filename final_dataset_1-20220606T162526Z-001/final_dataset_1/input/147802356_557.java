@Override
  public SafeFuture<Optional<BeaconState>> retrieveBlockState(Bytes32 blockRoot) {
    return getAndCacheBlockState(blockRoot);
  }
