@Override
  public OMClientResponse validateAndUpdateCache(OzoneManager ozoneManager,
      long transactionLogIndex,
      OzoneManagerDoubleBufferHelper ozoneManagerDoubleBufferHelper) {

    SetBucketPropertyRequest setBucketPropertyRequest =
        getOmRequest().getSetBucketPropertyRequest();
    Preconditions.checkNotNull(setBucketPropertyRequest);

    OMMetadataManager omMetadataManager = ozoneManager.getMetadataManager();
    OMMetrics omMetrics = ozoneManager.getMetrics();
    omMetrics.incNumBucketUpdates();

    BucketArgs bucketArgs = setBucketPropertyRequest.getBucketArgs();
    OmBucketArgs omBucketArgs = OmBucketArgs.getFromProtobuf(bucketArgs);

    String volumeName = bucketArgs.getVolumeName();
    String bucketName = bucketArgs.getBucketName();

    OMResponse.Builder omResponse = OmResponseUtil.getOMResponseBuilder(
        getOmRequest());
    OmBucketInfo omBucketInfo = null;

    AuditLogger auditLogger = ozoneManager.getAuditLogger();
    OzoneManagerProtocolProtos.UserInfo userInfo = getOmRequest().getUserInfo();
    IOException exception = null;
    boolean acquiredBucketLock = false, success = true;
    OMClientResponse omClientResponse = null;
    try {
      // check Acl
      if (ozoneManager.getAclsEnabled()) {
        checkAcls(ozoneManager, OzoneObj.ResourceType.BUCKET,
            OzoneObj.StoreType.OZONE, IAccessAuthorizer.ACLType.WRITE,
            volumeName, bucketName, null);
      }

      // acquire lock.
      acquiredBucketLock =  omMetadataManager.getLock().acquireWriteLock(
          BUCKET_LOCK, volumeName, bucketName);

      String bucketKey = omMetadataManager.getBucketKey(volumeName, bucketName);
      OmBucketInfo dbBucketInfo =
          omMetadataManager.getBucketTable().get(bucketKey);
      //Check if bucket exist
      if (dbBucketInfo == null) {
        LOG.debug("bucket: {} not found ", bucketName);
        throw new OMException("Bucket doesn't exist",
            OMException.ResultCodes.BUCKET_NOT_FOUND);
      }

      OmBucketInfo.Builder bucketInfoBuilder = OmBucketInfo.newBuilder();
      bucketInfoBuilder.setVolumeName(dbBucketInfo.getVolumeName())
          .setBucketName(dbBucketInfo.getBucketName())
          .setObjectID(dbBucketInfo.getObjectID())
          .setUpdateID(transactionLogIndex);
      bucketInfoBuilder.addAllMetadata(KeyValueUtil
          .getFromProtobuf(bucketArgs.getMetadataList()));

      //Check StorageType to update
      StorageType storageType = omBucketArgs.getStorageType();
      if (storageType != null) {
        bucketInfoBuilder.setStorageType(storageType);
        LOG.debug("Updating bucket storage type for bucket: {} in volume: {}",
            bucketName, volumeName);
      } else {
        bucketInfoBuilder.setStorageType(dbBucketInfo.getStorageType());
      }

      //Check Versioning to update
      Boolean versioning = omBucketArgs.getIsVersionEnabled();
      if (versioning != null) {
        bucketInfoBuilder.setIsVersionEnabled(versioning);
        LOG.debug("Updating bucket versioning for bucket: {} in volume: {}",
            bucketName, volumeName);
      } else {
        bucketInfoBuilder
            .setIsVersionEnabled(dbBucketInfo.getIsVersionEnabled());
      }

      //Check quotaInBytes and quotaInCounts to update
      String volumeKey = omMetadataManager.getVolumeKey(volumeName);
      OmVolumeArgs omVolumeArgs = omMetadataManager.getVolumeTable()
          .get(volumeKey);
      if (checkQuotaBytesValid(omMetadataManager, omVolumeArgs, omBucketArgs,
          volumeKey)) {
        bucketInfoBuilder.setQuotaInBytes(omBucketArgs.getQuotaInBytes());
      } else {
        bucketInfoBuilder.setQuotaInBytes(dbBucketInfo.getQuotaInBytes());
      }
      if (checkQuotaCountsValid(omVolumeArgs, omBucketArgs)) {
        bucketInfoBuilder.setQuotaInCounts(omBucketArgs.getQuotaInCounts());
      } else {
        bucketInfoBuilder.setQuotaInCounts(dbBucketInfo.getQuotaInCounts());
      }

      bucketInfoBuilder.setCreationTime(dbBucketInfo.getCreationTime());

      // Set acls from dbBucketInfo if it has any.
      if (dbBucketInfo.getAcls() != null) {
        bucketInfoBuilder.setAcls(dbBucketInfo.getAcls());
      }

      // Set the objectID to dbBucketInfo objectID, if present
      if (dbBucketInfo.getObjectID() != 0) {
        bucketInfoBuilder.setObjectID(dbBucketInfo.getObjectID());
      }

      // Set the updateID to current transaction log index
      bucketInfoBuilder.setUpdateID(transactionLogIndex);

      omBucketInfo = bucketInfoBuilder.build();

      // Update table cache.
      omMetadataManager.getBucketTable().addCacheEntry(
          new CacheKey<>(bucketKey),
          new CacheValue<>(Optional.of(omBucketInfo), transactionLogIndex));

      omResponse.setSetBucketPropertyResponse(
          SetBucketPropertyResponse.newBuilder().build());
      omClientResponse = new OMBucketSetPropertyResponse(
          omResponse.build(), omBucketInfo);
    } catch (IOException ex) {
      success = false;
      exception = ex;
      omClientResponse = new OMBucketSetPropertyResponse(
          createErrorOMResponse(omResponse, exception));
    } finally {
      addResponseToDoubleBuffer(transactionLogIndex, omClientResponse,
          ozoneManagerDoubleBufferHelper);
      if (acquiredBucketLock) {
        omMetadataManager.getLock().releaseWriteLock(BUCKET_LOCK, volumeName,
            bucketName);
      }
    }

    // Performing audit logging outside of the lock.
    auditLog(auditLogger, buildAuditMessage(OMAction.UPDATE_BUCKET,
        omBucketArgs.toAuditMap(), exception, userInfo));

    // return response.
    if (success) {
      LOG.debug("Setting bucket property for bucket:{} in volume:{}",
          bucketName, volumeName);
      return omClientResponse;
    } else {
      LOG.error("Setting bucket property failed for bucket:{} in volume:{}",
          bucketName, volumeName, exception);
      omMetrics.incNumBucketUpdateFails();
      return omClientResponse;
    }
  }