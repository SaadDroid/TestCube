public SafeFuture<Boolean> validate(final Eth2Peer peer, final PeerStatus newStatus) {
    LOG.trace("Validate chain of peer: {}", peer.getId());
    validationStartedCounter.inc();
    return isRemoteChainValid(peer, newStatus)
        .thenApply(
            isValid -> {
              if (!isValid) {
                // We are not on the same chain
                LOG.trace("Disconnecting peer on different chain: {}", peer.getId());
                chainInvalidCounter.inc();
                peer.disconnectCleanly(DisconnectReason.IRRELEVANT_NETWORK).reportExceptions();
              } else {
                LOG.trace("Validated peer's chain: {}", peer.getId());
                chainValidCounter.inc();
              }
              return isValid;
            })
        .exceptionally(
            err -> {
              LOG.debug("Unable to validate peer's chain, disconnecting {}", peer.getId(), err);
              validationErrorCounter.inc();
              peer.disconnectCleanly(DisconnectReason.UNABLE_TO_VERIFY_NETWORK).reportExceptions();
              return false;
            });
  }
