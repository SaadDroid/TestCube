public UInt64 getEpoch(Bytes32 blockRoot) {
    assertBlockIsInTree(blockRoot);
    final UInt64 slot = blockRootToSlot.get(blockRoot);
    return compute_epoch_at_slot(slot);
  }
