@Override
  public void onIncomingMessage(
      final Eth2Peer peer,
      final BeaconBlocksByRootRequestMessage message,
      final ResponseCallback<SignedBeaconBlock> callback) {
    LOG.trace(
        "Peer {} requested BeaconBlocks with roots: {}", peer.getId(), message.getBlockRoots());
    if (storageClient.getStore() != null) {
      SafeFuture<Void> future = SafeFuture.COMPLETE;
      if (!peer.wantToMakeRequest()
          || !peer.wantToReceiveObjects(callback, message.getBlockRoots().size())) {
        peer.disconnectCleanly(DisconnectReason.RATE_LIMITING).reportExceptions();
        return;
      }

      for (Bytes32 blockRoot : message.getBlockRoots()) {
        future =
            future.thenCompose(
                __ ->
                    storageClient
                        .getStore()
                        .retrieveSignedBlock(blockRoot)
                        .thenCompose(
                            block -> block.map(callback::respond).orElse(SafeFuture.COMPLETE)));
      }
      future.finish(callback::completeSuccessfully, callback::completeWithUnexpectedError);
    } else {
      callback.completeSuccessfully();
    }
  }
