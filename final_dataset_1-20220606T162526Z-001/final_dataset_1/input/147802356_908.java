public void onAttestationAggregationDue(final UInt64 slot) {
    execute(duties -> duties.performAggregation(slot));
  }
