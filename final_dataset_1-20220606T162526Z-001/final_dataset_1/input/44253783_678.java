@Override
  public String getValueFromMessage(AdaptrisMessage msg) throws CoreException {
    return msg.getMetadataValue(getMetadataKey());
  }
