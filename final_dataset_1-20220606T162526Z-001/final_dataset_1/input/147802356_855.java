public void onAttestationPublished(final UInt64 slot) {
    final UInt64 currentTime = timeProvider.getTimeInMillis();
    final UInt64 expectedTime = calculateExpectedAttestationTimeInMillis(slot);
    if (currentTime.isGreaterThanOrEqualTo(expectedTime)) {
      attestationHistogram.recordValue(currentTime.minus(expectedTime).longValue());
    } else {
      // The attestation was published ahead of time, likely because the block was received
      attestationHistogram.recordValue(0);
    }
  }
