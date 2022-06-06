public void acceptNextState(final BeaconState state) {
    if (slot.plus(slotsPerHistoricalRoot).compareTo(state.getSlot()) < 0) {
      final UInt64 floor = state.getSlot().minus(slotsPerHistoricalRoot);
      LOG.warn("Missing state root mappings from slot {} to {}", slot, floor);
      slot = floor;
    }

    while (slot.compareTo(state.getSlot()) < 0) {
      stateRootConsumer.accept(
          state.getState_roots().get(slot.mod(slotsPerHistoricalRoot).intValue()), slot);
      slot = slot.plus(UInt64.ONE);
    }

    stateRootConsumer.accept(state.hash_tree_root(), state.getSlot());
  }
