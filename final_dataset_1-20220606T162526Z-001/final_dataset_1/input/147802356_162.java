public SafeFuture<Optional<ValidatorResponse>> getValidatorDetails(
      final Optional<UInt64> maybeSlot, final Optional<Integer> maybeIndex) {
    if (!isStoreAvailable()) {
      throw new ChainDataUnavailableException();
    }

    if (maybeSlot.isEmpty() || maybeIndex.isEmpty()) {
      return SafeFuture.completedFuture(Optional.empty());
    }

    final int index = maybeIndex.get();

    return combinedChainDataClient
        .getStateAtSlotExact(maybeSlot.get())
        .thenApply(
            maybeState -> maybeState.map(state -> ValidatorResponse.fromState(state, index)));
  }
