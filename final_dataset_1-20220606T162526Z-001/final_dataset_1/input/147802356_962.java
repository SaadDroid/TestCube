@Override
  public void sendAggregateAndProof(final SignedAggregateAndProof aggregateAndProof) {
    asyncRunner
        .runAsync(
            () ->
                apiClient.sendAggregateAndProof(
                    new tech.pegasys.teku.api.schema.SignedAggregateAndProof(aggregateAndProof)))
        .finish(error -> LOG.error("Failed to send aggregate and proof", error));
  }
