public static BeaconState initialize_beacon_state_from_eth1(
      Bytes32 eth1_block_hash, UInt64 eth1_timestamp, List<? extends Deposit> deposits) {
    final GenesisGenerator genesisGenerator = new GenesisGenerator();
    genesisGenerator.updateCandidateState(eth1_block_hash, eth1_timestamp, deposits);
    return genesisGenerator.getGenesisState();
  }
