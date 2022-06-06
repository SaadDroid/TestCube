@Override
  public void onIncomingMessage(
      final Eth2Peer peer,
      final BeaconBlocksByRangeRequestMessage message,
      final ResponseCallback<SignedBeaconBlock> callback) {
    LOG.trace(
        "Peer {} requested {} BeaconBlocks starting at slot {} with step {}",
        peer.getId(),
        message.getCount(),
        message.getStartSlot(),
        message.getStep());
    if (message.getStep().compareTo(ONE) < 0) {
      callback.completeWithErrorResponse(
          new RpcException(INVALID_REQUEST_CODE, "Step must be greater than zero"));
      return;
    }
    if (message.getCount().compareTo(UInt64.valueOf(MAX_REQUEST_BLOCKS)) > 0) {
      callback.completeWithErrorResponse(
          new RpcException(
              INVALID_REQUEST_CODE,
              "Only a maximum of " + MAX_REQUEST_BLOCKS + " blocks can be requested per request"));
      return;
    }
    if (!peer.wantToMakeRequest()
        || !peer.wantToReceiveObjects(
            callback, maxRequestSize.min(message.getCount()).longValue())) {
      return;
    }

    sendMatchingBlocks(message, callback)
        .finish(
            callback::completeSuccessfully,
            error -> {
              final Throwable rootCause = Throwables.getRootCause(error);
              if (rootCause instanceof RpcException) {
                LOG.trace("Rejecting beacon blocks by range request", error); // Keep full context
                callback.completeWithErrorResponse((RpcException) rootCause);
              } else {
                if (rootCause instanceof StreamClosedException
                    || rootCause instanceof ClosedChannelException) {
                  LOG.trace("Stream closed while sending requested blocks", error);
                } else {
                  LOG.error("Failed to process blocks by range request", error);
                }
                callback.completeWithUnexpectedError(error);
              }
            });
  }
