@Override
  public SafeFuture<ValidationResult> handleMessage(final Bytes bytes) {
    return SafeFuture.of(() -> deserialize(bytes))
        .thenApply(this::wrapMessage)
        .thenCompose(
            wrapped ->
                asyncRunner.runAsync(
                    () ->
                        validateData(wrapped)
                            .thenApply(
                                internalValidation -> {
                                  processMessage(wrapped, internalValidation);
                                  return internalValidation.getGossipSubValidationResult();
                                })))
        .exceptionally(this::handleMessageProcessingError);
  }
