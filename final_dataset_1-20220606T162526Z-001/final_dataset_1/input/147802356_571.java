@Override
  public SafeFuture<Optional<SignedBeaconBlock>> retrieveSignedBlock(Bytes32 blockRoot) {
    if (blockAndStates.containsKey(blockRoot)) {
      return SafeFuture.completedFuture(
          Optional.of(blockAndStates.get(blockRoot)).map(SignedBlockAndState::getBlock));
    }
    return store.retrieveSignedBlock(blockRoot);
  }
