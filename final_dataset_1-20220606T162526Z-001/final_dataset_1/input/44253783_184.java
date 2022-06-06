@Override
  public String getContentType(AdaptrisMessage msg) throws CoreException {
    return build(extract(msg), msg.getContentEncoding());
  }
