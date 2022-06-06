@Override
  @SuppressWarnings("methodlength")
  public OMClientResponse validateAndUpdateCache(OzoneManager ozoneManager,
      long trxnLogIndex, OzoneManagerDoubleBufferHelper omDoubleBufferHelper) {

    RenameKeyRequest renameKeyRequest = getOmRequest().getRenameKeyRequest();
    OzoneManagerProtocolProtos.KeyArgs keyArgs =
        renameKeyRequest.getKeyArgs();
    Map<String, String> auditMap = buildAuditMap(keyArgs, renameKeyRequest);

    String volumeName = keyArgs.getVolumeName();
    String bucketName = keyArgs.getBucketName();
    String fromKeyName = keyArgs.getKeyName();
    String toKeyName = renameKeyRequest.getToKeyName();

    OMMetrics omMetrics = ozoneManager.getMetrics();
    omMetrics.incNumKeyRenames();

    AuditLogger auditLogger = ozoneManager.getAuditLogger();

    OMResponse.Builder omResponse = OmResponseUtil.getOMResponseBuilder(
        getOmRequest());

    OMMetadataManager omMetadataManager = ozoneManager.getMetadataManager();
    boolean acquiredLock = false;
    OMClientResponse omClientResponse = null;
    IOException exception = null;
    OmKeyInfo fromKeyValue = null;
    String toKey = null, fromKey = null;
    Result result = null;
    try {
      if (toKeyName.length() == 0 || fromKeyName.length() == 0) {
        throw new OMException("Key name is empty",
            OMException.ResultCodes.INVALID_KEY_NAME);
      }

      keyArgs = resolveBucketLink(ozoneManager, keyArgs, auditMap);
      volumeName = keyArgs.getVolumeName();
      bucketName = keyArgs.getBucketName();

      // check Acls to see if user has access to perform delete operation on
      // old key and create operation on new key
      checkKeyAcls(ozoneManager, volumeName, bucketName, fromKeyName,
          IAccessAuthorizer.ACLType.DELETE, OzoneObj.ResourceType.KEY);
      checkKeyAcls(ozoneManager, volumeName, bucketName, toKeyName,
          IAccessAuthorizer.ACLType.CREATE, OzoneObj.ResourceType.KEY);

      acquiredLock = omMetadataManager.getLock().acquireWriteLock(BUCKET_LOCK,
          volumeName, bucketName);

      // Validate bucket and volume exists or not.
      validateBucketAndVolume(omMetadataManager, volumeName, bucketName);

      // Check if toKey exists
      fromKey = omMetadataManager.getOzoneKey(volumeName, bucketName,
          fromKeyName);
      toKey = omMetadataManager.getOzoneKey(volumeName, bucketName, toKeyName);
      OmKeyInfo toKeyValue = omMetadataManager.getKeyTable().get(toKey);

      if (toKeyValue != null) {
        throw new OMException("Key already exists " + toKeyName,
              OMException.ResultCodes.KEY_ALREADY_EXISTS);
      }

      // fromKeyName should exist
      fromKeyValue = omMetadataManager.getKeyTable().get(fromKey);
      if (fromKeyValue == null) {
          // TODO: Add support for renaming open key
        throw new OMException("Key not found " + fromKey, KEY_NOT_FOUND);
      }

      fromKeyValue.setUpdateID(trxnLogIndex, ozoneManager.isRatisEnabled());

      fromKeyValue.setKeyName(toKeyName);

      //Set modification time
      fromKeyValue.setModificationTime(keyArgs.getModificationTime());

      // Add to cache.
      // fromKey should be deleted, toKey should be added with newly updated
      // omKeyInfo.
      Table<String, OmKeyInfo> keyTable = omMetadataManager.getKeyTable();

      keyTable.addCacheEntry(new CacheKey<>(fromKey),
          new CacheValue<>(Optional.absent(), trxnLogIndex));

      keyTable.addCacheEntry(new CacheKey<>(toKey),
          new CacheValue<>(Optional.of(fromKeyValue), trxnLogIndex));

      omClientResponse = new OMKeyRenameResponse(omResponse
          .setRenameKeyResponse(RenameKeyResponse.newBuilder()).build(),
          fromKeyName, toKeyName, fromKeyValue);

      result = Result.SUCCESS;
    } catch (IOException ex) {
      result = Result.FAILURE;
      exception = ex;
      omClientResponse = new OMKeyRenameResponse(createErrorOMResponse(
          omResponse, exception));
    } finally {
      addResponseToDoubleBuffer(trxnLogIndex, omClientResponse,
            omDoubleBufferHelper);
      if (acquiredLock) {
        omMetadataManager.getLock().releaseWriteLock(BUCKET_LOCK, volumeName,
            bucketName);
      }
    }

    auditLog(auditLogger, buildAuditMessage(OMAction.RENAME_KEY, auditMap,
        exception, getOmRequest().getUserInfo()));

    switch (result) {
    case SUCCESS:
      LOG.debug("Rename Key is successfully completed for volume:{} bucket:{}" +
              " fromKey:{} toKey:{}. ", volumeName, bucketName, fromKeyName,
          toKeyName);
      break;
    case FAILURE:
      ozoneManager.getMetrics().incNumKeyRenameFails();
      LOG.error("Rename key failed for volume:{} bucket:{} fromKey:{} " +
              "toKey:{}. Key: {} not found.", volumeName, bucketName,
          fromKeyName, toKeyName, fromKeyName);
      break;
    default:
      LOG.error("Unrecognized Result for OMKeyRenameRequest: {}",
          renameKeyRequest);
    }
    return omClientResponse;
  }
