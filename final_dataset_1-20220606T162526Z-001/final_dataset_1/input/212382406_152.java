@Override
  public void addToDBBatch(OMMetadataManager omMetadataManager,
      BatchOperation batchOperation) throws IOException {

    // Delete from openKey table and multipart info table.
    omMetadataManager.getOpenKeyTable().deleteWithBatch(batchOperation,
        multipartKey);
    omMetadataManager.getMultipartInfoTable().deleteWithBatch(batchOperation,
        multipartKey);

    // Move all the parts to delete table
    TreeMap<Integer, PartKeyInfo > partKeyInfoMap =
        omMultipartKeyInfo.getPartKeyInfoMap();
    for (Map.Entry<Integer, PartKeyInfo > partKeyInfoEntry :
        partKeyInfoMap.entrySet()) {
      PartKeyInfo partKeyInfo = partKeyInfoEntry.getValue();
      OmKeyInfo currentKeyPartInfo =
          OmKeyInfo.getFromProtobuf(partKeyInfo.getPartKeyInfo());

      RepeatedOmKeyInfo repeatedOmKeyInfo =
          omMetadataManager.getDeletedTable().get(partKeyInfo.getPartName());

      repeatedOmKeyInfo = OmUtils.prepareKeyForDelete(currentKeyPartInfo,
          repeatedOmKeyInfo, omMultipartKeyInfo.getUpdateID(), isRatisEnabled);

      omMetadataManager.getDeletedTable().putWithBatch(batchOperation,
          partKeyInfo.getPartName(), repeatedOmKeyInfo);

      // update volume usedBytes.
      omMetadataManager.getVolumeTable().putWithBatch(batchOperation,
          omMetadataManager.getVolumeKey(omVolumeArgs.getVolume()),
          omVolumeArgs);
      // update bucket usedBytes.
      omMetadataManager.getBucketTable().putWithBatch(batchOperation,
          omMetadataManager.getBucketKey(omVolumeArgs.getVolume(),
              omBucketInfo.getBucketName()), omBucketInfo);
    }
  }
