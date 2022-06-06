public Optional<UInt64> stateParameterToSlot(final String pathParam) {
    if (!isStoreAvailable()) {
      throw new ChainDataUnavailableException();
    }
    try {
      switch (pathParam) {
        case ("head"):
          return recentChainData.getCurrentSlot();
        case ("genesis"):
          return Optional.of(UInt64.ZERO);
        case ("finalized"):
          return recentChainData.getFinalizedCheckpoint().map(Checkpoint::getEpochStartSlot);
        case ("justified"):
          return recentChainData.getJustifiedCheckpoint().map(Checkpoint::getEpochStartSlot);
      }
      if (pathParam.toLowerCase().startsWith("0x")) {
        // state root
        Bytes32 stateRoot = Bytes32.fromHexString(pathParam);
        return combinedChainDataClient.getSlotByStateRoot(stateRoot).join();
      } else {
        final UInt64 slot = UInt64.valueOf(pathParam);
        final UInt64 headSlot = recentChainData.getHeadSlot();
        if (slot.isGreaterThan(headSlot)) {
          throw new IllegalArgumentException(
              String.format("Invalid state: %s is beyond head slot %s", slot, headSlot));
        }
        return Optional.of(UInt64.valueOf(pathParam));
      }
    } catch (NumberFormatException ex) {
      throw new IllegalArgumentException(String.format("Invalid state: %s", pathParam));
    }
  }
