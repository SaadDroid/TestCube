@Override
  public String createName(AdaptrisMessage msg) throws CoreException {
    if (getMetadataKey() == null) {
      throw new CoreException("illegal metadata key [" + metadataKey + "]");
    }
    return StringUtils.defaultIfEmpty(msg.getMetadataValue(metadataKey), defaultName);
  }
