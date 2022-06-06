@Override
  public void init() throws CoreException {
    if (isEmpty(getMetadataKey())) throw new CoreException("metadata-key is empty/null");
    super.init();
  }
