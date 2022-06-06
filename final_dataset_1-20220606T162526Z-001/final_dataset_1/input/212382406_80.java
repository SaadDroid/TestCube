@Override
  public OMClientResponse validateAndUpdateCache(OzoneManager ozoneManager,
      long trxnLogIndex, OzoneManagerDoubleBufferHelper omDoubleBufferHelper) {

    MultipartUploadAbortRequest multipartUploadAbortRequest = getOmRequest()
        .getAbortMultiPartUploadRequest();
    OzoneManagerProtocolProtos.KeyArgs keyArgs = multipartUploadAbortRequest
        .getKeyArgs();
    Map<String, String> auditMap = buildKeyArgsAuditMap(keyArgs);

    String volumeName = keyArgs.getVolumeName();
    String bucketName = keyArgs.getBucketName();
    final String requestedVolume = volumeName;
    final String requestedBucket = bucketName;
    String keyName = keyArgs.getKeyName();

    ozoneManager.getMetrics().incNumAbortMultipartUploads();
    OMMetadataManager omMetadataManager = ozoneManager.getMetadataManager();
    boolean acquiredLock = false;
    IOException exception = null;
    OmMultipartKeyInfo multipartKeyInfo = null;
    String multipartKey = null;
    OMResponse.Builder omResponse = OmResponseUtil.getOMResponseBuilder(
        getOmRequest());
    OMClientResponse omClientResponse = null;
    Result result = null;
    OmVolumeArgs omVolumeArgs = null;
    OmBucketInfo omBucketInfo = null;
    try {
      keyArgs = resolveBucketLink(ozoneManager, keyArgs, auditMap);
      volumeName = keyArgs.getVolumeName();
      bucketName = keyArgs.getBucketName();

      // TODO to support S3 ACL later.
      acquiredLock =
          omMetadataManager.getLock().acquireWriteLock(BUCKET_LOCK,
              volumeName, bucketName);

      validateBucketAndVolume(omMetadataManager, volumeName, bucketName);

      multipartKey = omMetadataManager.getMultipartKey(
          volumeName, bucketName, keyName, keyArgs.getMultipartUploadID());

      OmKeyInfo omKeyInfo =
          omMetadataManager.getOpenKeyTable().get(multipartKey);
      omVolumeArgs = getVolumeInfo(omMetadataManager, volumeName);
      omBucketInfo = getBucketInfo(omMetadataManager, volumeName, bucketName);

      // If there is no entry in openKeyTable, then there is no multipart
      // upload initiated for this key.
      if (omKeyInfo == null) {
        throw new OMException("Abort Multipart Upload Failed: volume: " +
            requestedVolume + "bucket: " + requestedBucket + "key: " + keyName,
            OMException.ResultCodes.NO_SUCH_MULTIPART_UPLOAD_ERROR);
      }

      multipartKeyInfo = omMetadataManager.getMultipartInfoTable()
          .get(multipartKey);
      multipartKeyInfo.setUpdateID(trxnLogIndex, ozoneManager.isRatisEnabled());

      // When abort uploaded key, we need to subtract the PartKey length from
      // the volume usedBytes.
      long quotaReleased = 0;
      int keyFactor = omKeyInfo.getFactor().getNumber();
      Iterator iter =
          multipartKeyInfo.getPartKeyInfoMap().entrySet().iterator();
      while(iter.hasNext()) {
        Map.Entry entry = (Map.Entry)iter.next();
        PartKeyInfo iterPartKeyInfo = (PartKeyInfo)entry.getValue();
        quotaReleased +=
            iterPartKeyInfo.getPartKeyInfo().getDataSize() * keyFactor;
      }
      omVolumeArgs.getUsedBytes().add(-quotaReleased);
      omBucketInfo.getUsedBytes().add(-quotaReleased);

      // Update cache of openKeyTable and multipartInfo table.
      // No need to add the cache entries to delete table, as the entries
      // in delete table are not used by any read/write operations.
      omMetadataManager.getOpenKeyTable().addCacheEntry(
          new CacheKey<>(multipartKey),
          new CacheValue<>(Optional.absent(), trxnLogIndex));
      omMetadataManager.getMultipartInfoTable().addCacheEntry(
          new CacheKey<>(multipartKey),
          new CacheValue<>(Optional.absent(), trxnLogIndex));

      omClientResponse = new S3MultipartUploadAbortResponse(
          omResponse.setAbortMultiPartUploadResponse(
              MultipartUploadAbortResponse.newBuilder()).build(),
          multipartKey, multipartKeyInfo, ozoneManager.isRatisEnabled(),
          omVolumeArgs, omBucketInfo);

      result = Result.SUCCESS;
    } catch (IOException ex) {
      result = Result.FAILURE;
      exception = ex;
      omClientResponse =
          new S3MultipartUploadAbortResponse(createErrorOMResponse(omResponse,
              exception));
    } finally {
      addResponseToDoubleBuffer(trxnLogIndex, omClientResponse,
          omDoubleBufferHelper);
      if (acquiredLock) {
        omMetadataManager.getLock().releaseWriteLock(BUCKET_LOCK,
            volumeName, bucketName);
      }
    }

    // audit log
    auditLog(ozoneManager.getAuditLogger(), buildAuditMessage(
        OMAction.ABORT_MULTIPART_UPLOAD, auditMap,
        exception, getOmRequest().getUserInfo()));

    switch (result) {
    case SUCCESS:
      LOG.debug("Abort Multipart request is successfully completed for " +
              "KeyName {} in VolumeName/Bucket {}/{}", keyName, volumeName,
          bucketName);
      break;
    case FAILURE:
      ozoneManager.getMetrics().incNumAbortMultipartUploadFails();
      LOG.error("Abort Multipart request is failed for KeyName {} in " +
              "VolumeName/Bucket {}/{}", keyName, volumeName, bucketName,
          exception);
      break;
    default:
      LOG.error("Unrecognized Result for S3MultipartUploadAbortRequest: {}",
          multipartUploadAbortRequest);
    }

    return omClientResponse;
  }
