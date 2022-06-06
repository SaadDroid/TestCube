@Override
  @SuppressWarnings("methodlength")
  public OMClientResponse validateAndUpdateCache(OzoneManager ozoneManager,
      long trxnLogIndex, OzoneManagerDoubleBufferHelper omDoubleBufferHelper) {

    CreateFileRequest createFileRequest = getOmRequest().getCreateFileRequest();
    KeyArgs keyArgs = createFileRequest.getKeyArgs();
    Map<String, String> auditMap = buildKeyArgsAuditMap(keyArgs);

    String volumeName = keyArgs.getVolumeName();
    String bucketName = keyArgs.getBucketName();
    String keyName = keyArgs.getKeyName();

    // if isRecursive is true, file would be created even if parent
    // directories does not exist.
    boolean isRecursive = createFileRequest.getIsRecursive();
    if (LOG.isDebugEnabled()) {
      LOG.debug("File create for : " + volumeName + "/" + bucketName + "/"
          + keyName + ":" + isRecursive);
    }

    // if isOverWrite is true, file would be over written.
    boolean isOverWrite = createFileRequest.getIsOverwrite();

    OMMetrics omMetrics = ozoneManager.getMetrics();
    omMetrics.incNumCreateFile();

    OMMetadataManager omMetadataManager = ozoneManager.getMetadataManager();

    boolean acquiredLock = false;

    OmKeyInfo omKeyInfo = null;
    OmVolumeArgs omVolumeArgs = null;
    OmBucketInfo omBucketInfo = null;
    final List<OmKeyLocationInfo> locations = new ArrayList<>();
    List<OmKeyInfo> missingParentInfos;

    OMClientResponse omClientResponse = null;
    OMResponse.Builder omResponse = OmResponseUtil.getOMResponseBuilder(
        getOmRequest());
    IOException exception = null;
    Result result = null;
    try {
      keyArgs = resolveBucketLink(ozoneManager, keyArgs, auditMap);
      volumeName = keyArgs.getVolumeName();
      bucketName = keyArgs.getBucketName();

      // check Acl
      checkKeyAcls(ozoneManager, volumeName, bucketName, keyName,
          IAccessAuthorizer.ACLType.CREATE, OzoneObj.ResourceType.KEY);

      // acquire lock
      acquiredLock = omMetadataManager.getLock().acquireWriteLock(BUCKET_LOCK,
          volumeName, bucketName);

      validateBucketAndVolume(omMetadataManager, volumeName, bucketName);

      if (keyName.length() == 0) {
        // Check if this is the root of the filesystem.
        throw new OMException("Can not write to directory: " + keyName,
            OMException.ResultCodes.NOT_A_FILE);
      }

      String ozoneKey = omMetadataManager.getOzoneKey(volumeName, bucketName,
          keyName);
      OmKeyInfo dbKeyInfo = omMetadataManager.getKeyTable()
          .getIfExist(ozoneKey);

      if (dbKeyInfo != null) {
        ozoneManager.getKeyManager().refresh(dbKeyInfo);
      }

      OMFileRequest.OMPathInfo pathInfo =
          OMFileRequest.verifyFilesInPath(omMetadataManager, volumeName,
              bucketName, keyName, Paths.get(keyName));
      OMFileRequest.OMDirectoryResult omDirectoryResult =
          pathInfo.getDirectoryResult();
      List<OzoneAcl> inheritAcls = pathInfo.getAcls();

      // Check if a file or directory exists with same key name.
      if (omDirectoryResult == FILE_EXISTS) {
        if (!isOverWrite) {
          throw new OMException("File " + keyName + " already exists",
              OMException.ResultCodes.FILE_ALREADY_EXISTS);
        }
      } else if (omDirectoryResult == DIRECTORY_EXISTS) {
        throw new OMException("Can not write to directory: " + keyName,
            OMException.ResultCodes.NOT_A_FILE);
      } else if (omDirectoryResult == FILE_EXISTS_IN_GIVENPATH) {
        throw new OMException(
            "Can not create file: " + keyName + " as there " +
                "is already file in the given path",
            OMException.ResultCodes.NOT_A_FILE);
      }

      if (!isRecursive) {
        checkAllParentsExist(ozoneManager, keyArgs, pathInfo);
      }

      // do open key
      OmBucketInfo bucketInfo = omMetadataManager.getBucketTable().get(
          omMetadataManager.getBucketKey(volumeName, bucketName));

      omKeyInfo = prepareKeyInfo(omMetadataManager, keyArgs, dbKeyInfo,
          keyArgs.getDataSize(), locations, getFileEncryptionInfo(keyArgs),
          ozoneManager.getPrefixManager(), bucketInfo, trxnLogIndex,
          ozoneManager.isRatisEnabled());

      long openVersion = omKeyInfo.getLatestVersionLocations().getVersion();
      long clientID = createFileRequest.getClientID();
      String dbOpenKeyName = omMetadataManager.getOpenKey(volumeName,
          bucketName, keyName, clientID);

      missingParentInfos = OMDirectoryCreateRequest
          .getAllParentInfo(ozoneManager, keyArgs,
              pathInfo.getMissingParents(), inheritAcls, trxnLogIndex);

      // Append new blocks
      List<OmKeyLocationInfo> newLocationList = keyArgs.getKeyLocationsList()
          .stream().map(OmKeyLocationInfo::getFromProtobuf)
          .collect(Collectors.toList());
      omKeyInfo.appendNewBlocks(newLocationList, false);

      omVolumeArgs = getVolumeInfo(omMetadataManager, volumeName);
      omBucketInfo = getBucketInfo(omMetadataManager, volumeName, bucketName);
      // check volume quota
      long preAllocatedSpace = newLocationList.size()
          * ozoneManager.getScmBlockSize()
          * omKeyInfo.getFactor().getNumber();
      checkVolumeQuotaInBytes(omVolumeArgs, preAllocatedSpace);

      // Add to cache entry can be done outside of lock for this openKey.
      // Even if bucket gets deleted, when commitKey we shall identify if
      // bucket gets deleted.
      omMetadataManager.getOpenKeyTable().addCacheEntry(
          new CacheKey<>(dbOpenKeyName),
          new CacheValue<>(Optional.of(omKeyInfo), trxnLogIndex));

      // Add cache entries for the prefix directories.
      // Skip adding for the file key itself, until Key Commit.
      OMFileRequest.addKeyTableCacheEntries(omMetadataManager, volumeName,
          bucketName, Optional.absent(), Optional.of(missingParentInfos),
          trxnLogIndex);

      // update usedBytes atomically.
      omVolumeArgs.getUsedBytes().add(preAllocatedSpace);
      omBucketInfo.getUsedBytes().add(preAllocatedSpace);

      // Prepare response
      omResponse.setCreateFileResponse(CreateFileResponse.newBuilder()
          .setKeyInfo(omKeyInfo.getProtobuf())
          .setID(clientID)
          .setOpenVersion(openVersion).build())
          .setCmdType(Type.CreateFile);
      omClientResponse = new OMFileCreateResponse(omResponse.build(),
          omKeyInfo, missingParentInfos, clientID, omVolumeArgs, omBucketInfo);

      result = Result.SUCCESS;
    } catch (IOException ex) {
      result = Result.FAILURE;
      exception = ex;
      omMetrics.incNumCreateFileFails();
      omResponse.setCmdType(Type.CreateFile);
      omClientResponse = new OMFileCreateResponse(createErrorOMResponse(
            omResponse, exception));
    } finally {
      addResponseToDoubleBuffer(trxnLogIndex, omClientResponse,
          omDoubleBufferHelper);
      if (acquiredLock) {
        omMetadataManager.getLock().releaseWriteLock(BUCKET_LOCK, volumeName,
            bucketName);
      }
    }

    // Audit Log outside the lock
    auditLog(ozoneManager.getAuditLogger(), buildAuditMessage(
        OMAction.CREATE_FILE, auditMap, exception,
        getOmRequest().getUserInfo()));

    switch (result) {
    case SUCCESS:
      LOG.debug("File created. Volume:{}, Bucket:{}, Key:{}", volumeName,
          bucketName, keyName);
      break;
    case FAILURE:
      LOG.error("File create failed. Volume:{}, Bucket:{}, Key{}.",
          volumeName, bucketName, keyName, exception);
      break;
    default:
      LOG.error("Unrecognized Result for OMFileCreateRequest: {}",
          createFileRequest);
    }

    return omClientResponse;
  }
