@Override
  public String getContentType(AdaptrisMessage msg) throws CoreException {
    return build(getMimeType(), msg.getContentEncoding());
  }
