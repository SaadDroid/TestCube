@Override
  public String getContentType(AdaptrisMessage msg) throws CoreException {
    // Unfold the header to force it onto the same line regardless.
    return msg.resolve(getContentType()).replaceAll("\\s\\r\\n\\s+", " ").replaceAll("\\r\\n\\s+", " ");
  }
