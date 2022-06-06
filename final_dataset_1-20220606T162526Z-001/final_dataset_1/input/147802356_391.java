@SuppressWarnings("unchecked")
  public SafeFuture<RpcStream> sendRequest(
      Connection connection, Bytes initialPayload, RpcRequestHandler handler) {

    Interruptor closeInterruptor =
        SafeFuture.createInterruptor(connection.closeFuture(), PeerDisconnectedException::new);
    Interruptor timeoutInterruptor =
        SafeFuture.createInterruptor(
            asyncRunner.getDelayedFuture(TIMEOUT.toMillis(), TimeUnit.MILLISECONDS),
            () ->
                new StreamTimeoutException(
                    "Timed out waiting to initialize stream for method " + rpcMethod.getId()));

    return SafeFuture.notInterrupted(closeInterruptor)
        .thenApply(
            __ ->
                connection.muxerSession().createStream(Multistream.create(this).toStreamHandler()))
        // waiting for a stream or interrupt
        .thenWaitFor(StreamPromise::getStream)
        .orInterrupt(closeInterruptor, timeoutInterruptor)
        .thenCompose(
            streamPromise ->
                // waiting for controller, writing initial payload or interrupt
                SafeFuture.of(streamPromise.getController())
                    .orInterrupt(closeInterruptor, timeoutInterruptor)
                    .thenPeek(ctr -> ctr.setRequestHandler(handler))
                    .thenApply(Controller::getRpcStream)
                    .thenWaitFor(rpcStream -> rpcStream.writeBytes(initialPayload))
                    .orInterrupt(closeInterruptor, timeoutInterruptor)
                    // closing the stream in case of any errors or interruption
                    .whenException(err -> closeStreamAbruptly(streamPromise.getStream().join())));
  }
