public synchronized SSZList<Deposit> getDeposits(BeaconState state, Eth1Data eth1Data) {
    UInt64 eth1DepositCount;
    if (isEnoughVotesToUpdateEth1Data(getVoteCount(state, eth1Data) + 1)) {
      eth1DepositCount = eth1Data.getDeposit_count();
    } else {
      eth1DepositCount = state.getEth1_data().getDeposit_count();
    }

    UInt64 eth1DepositIndex = state.getEth1_deposit_index();

    // We need to have all the deposits that can be included in the state available to ensure
    // the generated proofs are valid
    checkRequiredDepositsAvailable(eth1DepositCount, eth1DepositIndex);

    UInt64 latestDepositIndexWithMaxBlock = eth1DepositIndex.plus(MAX_DEPOSITS);

    UInt64 toDepositIndex =
        latestDepositIndexWithMaxBlock.isGreaterThan(eth1DepositCount)
            ? eth1DepositCount
            : latestDepositIndexWithMaxBlock;

    return SSZList.createMutable(
        getDepositsWithProof(eth1DepositIndex, toDepositIndex, eth1DepositCount),
        MAX_DEPOSITS,
        Deposit.class);
  }
