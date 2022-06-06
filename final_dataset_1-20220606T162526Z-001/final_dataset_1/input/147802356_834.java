@Override
  public SafeFuture<Optional<List<AttesterDuties>>> getAttestationDuties(
      final UInt64 epoch, final Collection<Integer> validatorIndexes) {
    if (isSyncActive()) {
      return NodeSyncingException.failedFuture();
    }
    if (validatorIndexes.isEmpty()) {
      return SafeFuture.completedFuture(Optional.of(emptyList()));
    }
    if (epoch.isGreaterThan(
        combinedChainDataClient.getCurrentEpoch().plus(Constants.MIN_SEED_LOOKAHEAD))) {
      return SafeFuture.failedFuture(
          new IllegalArgumentException(
              String.format(
                  "Attestation duties were requested %s epochs ahead, only 1 epoch in future is supported.",
                  epoch.minus(combinedChainDataClient.getCurrentEpoch()).toString())));
    }
    final UInt64 slot = CommitteeUtil.getEarliestQueryableSlotForTargetEpoch(epoch);
    LOG.trace("Retrieving attestation duties from epoch {} using state at slot {}", epoch, slot);
    return combinedChainDataClient
        .getLatestStateAtSlot(slot)
        .thenApply(
            optionalState ->
                optionalState
                    .map(state -> processSlots(state, slot))
                    .map(
                        state ->
                            getAttesterDutiesFromIndexesAndState(state, epoch, validatorIndexes)));
  }
