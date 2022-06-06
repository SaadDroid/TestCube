public void validateLatestFinalizedCheckpoint(
      final CheckpointState latestFinalizedCheckpoint, final UInt64 currentSlot) {
    if (isPriorToWSCheckpoint(latestFinalizedCheckpoint)) {
      // Defer validation until we reach the weakSubjectivity checkpoint
      LOG.debug(
          "Latest finalized checkpoint at epoch {} is prior to weak subjectivity checkpoint at epoch {}. Defer validation.",
          latestFinalizedCheckpoint.getEpoch(),
          config.getWeakSubjectivityCheckpoint().orElseThrow().getEpoch());
      return;
    }

    // Validate against ws checkpoint
    if (isAtWSCheckpoint(latestFinalizedCheckpoint)
        && !isWSCheckpointRoot(latestFinalizedCheckpoint.getRoot())) {
      // Finalized root is inconsistent with ws checkpoint
      handleInconsistentWsCheckpoint(latestFinalizedCheckpoint.getBlock());
    }

    // Determine whether we should suppress ws period errors
    UInt64 currentEpoch = compute_epoch_at_slot(currentSlot);
    final Optional<UInt64> suppressionEpoch = getSuppressWSPeriodChecksUntilEpoch(currentSlot);
    final boolean shouldSuppressErrors =
        suppressionEpoch.map(e -> e.isGreaterThan(currentEpoch)).orElse(false);

    // Validate against ws period
    final boolean withinWSPeriod = isWithinWSPeriod(latestFinalizedCheckpoint, currentSlot);
    if (!withinWSPeriod && !shouldSuppressErrors) {
      handleFinalizedCheckpointOutsideWSPeriod(latestFinalizedCheckpoint, currentSlot);
    } else if (!withinWSPeriod
        && currentSlot.mod(SUPPRESSION_WARNING_PERIOD_IN_SLOTS).equals(UInt64.ZERO)
        && getAndSetLastLoggedSlot(currentSlot).isLessThan(currentSlot)) {
      STATUS_LOG.warnWeakSubjectivityChecksSuppressed(suppressionEpoch.orElseThrow());
    }
  }
