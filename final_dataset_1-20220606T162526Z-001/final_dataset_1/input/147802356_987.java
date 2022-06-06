@Override
  public void onDepositsFromBlock(final DepositsFromBlockEvent event) {
    if (!recentChainData.isPreGenesis()) {
      return;
    }

    LOG.trace(
        "Processing {} deposits from block {}", event.getDeposits().size(), event.getBlockNumber());
    final List<DepositWithIndex> deposits =
        event.getDeposits().stream()
            .map(DepositUtil::convertDepositEventToOperationDeposit)
            .collect(Collectors.toList());

    processNewData(event.getBlockHash(), event.getBlockTimestamp(), deposits);
  }
