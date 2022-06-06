public void deleteBlock(Container container, BlockID blockID) throws
      IOException {
    Preconditions.checkNotNull(blockID, "block ID cannot be null.");
    Preconditions.checkState(blockID.getContainerID() >= 0,
        "Container ID cannot be negative.");
    Preconditions.checkState(blockID.getLocalID() >= 0,
        "Local ID cannot be negative.");

    KeyValueContainerData cData = (KeyValueContainerData) container
        .getContainerData();
    try(ReferenceCountedDB db = BlockUtils.getDB(cData, config)) {
      // This is a post condition that acts as a hint to the user.
      // Should never fail.
      Preconditions.checkNotNull(db, DB_NULL_ERR_MSG);
      // Note : There is a race condition here, since get and delete
      // are not atomic. Leaving it here since the impact is refusing
      // to delete a Block which might have just gotten inserted after
      // the get check.

      // Throw an exception if block data not found in the block data table.
      getBlockByID(db, blockID);

      // Update DB to delete block and set block count and bytes used.
      BatchOperation batch = db.getStore().getBatchHandler()
              .initBatchOperation();
      String localID = Long.toString(blockID.getLocalID());
      db.getStore().getBlockDataTable().deleteWithBatch(batch, localID);
      // Update DB to delete block and set block count.
      // No need to set bytes used here, as bytes used is taken care during
      // delete chunk.
      long blockCount = container.getContainerData().getKeyCount() - 1;
      db.getStore().getMetadataTable()
              .putWithBatch(batch, OzoneConsts.BLOCK_COUNT, blockCount);
      db.getStore().getBatchHandler().commitBatchOperation(batch);

      // Decrement block count here
      container.getContainerData().decrKeyCount();
    }
  }
