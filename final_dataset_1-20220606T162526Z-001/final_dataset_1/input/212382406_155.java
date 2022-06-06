@Override
  protected void addToDBBatch(OMMetadataManager omMetadataManager,
      BatchOperation batchOperation) throws IOException {

    String dbVolumeKey =
        omMetadataManager.getVolumeKey(omVolumeArgs.getVolume());
    String dbUserKey =
        omMetadataManager.getUserKey(omVolumeArgs.getOwnerName());

    omMetadataManager.getVolumeTable().putWithBatch(batchOperation,
        dbVolumeKey, omVolumeArgs);
    omMetadataManager.getUserTable().putWithBatch(batchOperation, dbUserKey,
        userVolumeInfo);
  }
