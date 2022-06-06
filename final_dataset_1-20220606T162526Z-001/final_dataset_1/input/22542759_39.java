public List<DeletedEntry> scanAndGetFilesToDelete(final long tillTime, final int fileCleanupBatchSize) {
    final List<DeletedEntry> toDelete = new ArrayList<>(fileCleanupBatchSize);

    try {
      final AtomicReference<Range> range = new AtomicReference<>(Range.all());
      // stop cleaning up if there are no files to delete or if we have reached batch size
      while (range.get() != null) {
        TransactionRunners.run(transactionRunner, context -> {
          StructuredTable table = context.getTable(StoreDefinition.LogFileMetaStore.LOG_FILE_META);
          range.set(scanFilesToDelete(table, fileCleanupBatchSize, tillTime, toDelete, range));
        }, IOException.class);
      }
    } catch (IOException e) {
      LOG.warn("Got Exception while scanning metadata table", e);
      // if there is an exception, no metadata, so delete file should be skipped.
      return new ArrayList<>();
    }

    if (!toDelete.isEmpty()) {
      // delete meta data entries in toDelete and get the file location list
      return deleteNewMetadataEntries(toDelete);
    }
    // toDelete is empty, safe to return that
    return toDelete;
  }
