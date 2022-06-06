@Override
  public SafeFuture<Optional<List<ValidatorDuties>>> getDuties(
      final UInt64 epoch, final Collection<BLSPublicKey> publicKeys) {
    if (isSyncActive()) {
      return NodeSyncingException.failedFuture();
    }
    if (publicKeys.isEmpty()) {
      return SafeFuture.completedFuture(Optional.of(emptyList()));
    }
    final UInt64 slot = CommitteeUtil.getEarliestQueryableSlotForTargetEpoch(epoch);
    LOG.trace("Retrieving duties from epoch {} using state at slot {}", epoch, slot);
    return combinedChainDataClient
        .getLatestStateAtSlot(slot)
        .thenApply(
            optionalState ->
                optionalState
                    .map(state -> processSlots(state, slot))
                    .map(state -> getValidatorDutiesFromState(state, epoch, publicKeys)));
  }
