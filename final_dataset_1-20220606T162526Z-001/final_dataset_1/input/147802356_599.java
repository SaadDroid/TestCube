public Optional<Bytes32> getBlockRootBySlot(final UInt64 slot) {
    return chainHead.flatMap(head -> getBlockRootBySlot(slot, head.getRoot()));
  }
