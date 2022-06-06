public void checkAndUpdateDB(OMMetadataManager omMetadataManager,
      BatchOperation batchOperation) throws IOException {
    if (getOMResponse().getStatus() == OK ||
        getOMResponse().getStatus() == PARTIAL_DELETE) {
      addToDBBatch(omMetadataManager, batchOperation);
    }
  }
