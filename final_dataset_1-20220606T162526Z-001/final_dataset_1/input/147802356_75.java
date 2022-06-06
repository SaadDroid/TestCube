public void start() {
    eth1DepositStorageChannel
        .replayDepositEvents()
        .thenCompose(
            replayDepositsResult -> {
              replayDepositsResult
                  .getLastProcessedDepositIndex()
                  .map(UInt64::valueOf)
                  .ifPresent(eth1EventsPublisher::setLatestPublishedDeposit);
              return getHead()
                  .thenCompose(headBlock -> processStart(headBlock, replayDepositsResult));
            })
        .thenAccept(__ -> LOG.info("Eth1DepositsManager successfully ran startup sequence."))
        .exceptionally(
            (err) -> {
              throw new FatalServiceFailureException(getClass(), err);
            })
        .reportExceptions();
  }
