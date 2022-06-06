public static BlockTree create(
      final HashTree hashTree, final Map<Bytes32, UInt64> blockRootToSlot) {
    return new BlockTree(hashTree, blockRootToSlot);
  }
