@Override
  public void addToDBBatch(OMMetadataManager omMetadataManager,
      BatchOperation batchOperation) throws IOException {

    String openKey = omMetadataManager.getOpenKey(omKeyInfo.getVolumeName(),
        omKeyInfo.getBucketName(), omKeyInfo.getKeyName(), clientID);
    omMetadataManager.getOpenKeyTable().putWithBatch(batchOperation, openKey,
        omKeyInfo);

    // update volume usedBytes.
    omMetadataManager.getVolumeTable().putWithBatch(batchOperation,
        omMetadataManager.getVolumeKey(omVolumeArgs.getVolume()),
        omVolumeArgs);
    // update bucket usedBytes.
    omMetadataManager.getBucketTable().putWithBatch(batchOperation,
        omMetadataManager.getBucketKey(omVolumeArgs.getVolume(),
            omBucketInfo.getBucketName()), omBucketInfo);
  }
