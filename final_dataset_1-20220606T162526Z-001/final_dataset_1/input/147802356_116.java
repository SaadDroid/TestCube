public SafeFuture<Optional<BeaconBlock>> getUnsignedBeaconBlockAtSlot(
      UInt64 slot, BLSSignature randao, Optional<Bytes32> graffiti) {
    if (slot == null) {
      throw new IllegalArgumentException(NO_SLOT_PROVIDED);
    }
    if (randao == null) {
      throw new IllegalArgumentException(NO_RANDAO_PROVIDED);
    }
    UInt64 bestSlot = combinedChainDataClient.getHeadSlot();
    if (bestSlot.plus(SLOTS_PER_EPOCH).isLessThan(slot)) {
      throw new IllegalArgumentException(CANNOT_PRODUCE_FAR_FUTURE_BLOCK);
    }
    if (bestSlot.isGreaterThan(slot)) {
      throw new IllegalArgumentException(CANNOT_PRODUCE_HISTORIC_BLOCK);
    }

    return validatorApiChannel
        .createUnsignedBlock(
            slot,
            tech.pegasys.teku.bls.BLSSignature.fromBytesCompressed(randao.getBytes()),
            graffiti)
        .thenApply(maybeBlock -> maybeBlock.map(BeaconBlock::new));
  }
