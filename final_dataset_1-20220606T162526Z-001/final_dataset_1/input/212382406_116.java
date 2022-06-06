@Override
  public OMRequest preExecute(OzoneManager ozoneManager) {
    CreateDirectoryRequest createDirectoryRequest =
        getOmRequest().getCreateDirectoryRequest();
    Preconditions.checkNotNull(createDirectoryRequest);

    KeyArgs.Builder newKeyArgs = createDirectoryRequest.getKeyArgs()
        .toBuilder().setModificationTime(Time.now());

    CreateDirectoryRequest.Builder newCreateDirectoryRequest =
        createDirectoryRequest.toBuilder().setKeyArgs(newKeyArgs);

    return getOmRequest().toBuilder().setCreateDirectoryRequest(
        newCreateDirectoryRequest).setUserInfo(getUserInfo()).build();

  }
