@VisibleForTesting
  Optional<UInt64> getSuppressWSPeriodChecksUntilEpoch(final UInt64 currentSlot) {
    if (suppressWSPeriodErrorsUntilEpoch.isEmpty()
        && config.getSuppressWSPeriodChecksUntilEpoch().isPresent()) {
      // Initialize the suppression logic
      final UInt64 configuredSuppressionEpoch = config.getSuppressWSPeriodChecksUntilEpoch().get();
      final UInt64 startupEpoch = compute_epoch_at_slot(currentSlot);
      final UInt64 maxSuppressedEpoch = startupEpoch.plus(MAX_SUPPRESSED_EPOCHS);
      final UInt64 suppressionEpoch = configuredSuppressionEpoch.min(maxSuppressedEpoch);
      if (suppressionEpoch.isLessThan(configuredSuppressionEpoch)) {
        LOG.info(
            "Configured weak subjectivity error suppression epoch ({}) is too large, suppression epoch set to {} ({} epochs ahead of current epoch {}).",
            configuredSuppressionEpoch,
            suppressionEpoch,
            MAX_SUPPRESSED_EPOCHS,
            startupEpoch);
      }
      LOG.warn(
          "Configured to suppress weak subjectivity period checks until epoch {}",
          suppressionEpoch);

      suppressWSPeriodErrorsUntilEpoch = Optional.of(suppressionEpoch);
    }

    return suppressWSPeriodErrorsUntilEpoch;
  }
