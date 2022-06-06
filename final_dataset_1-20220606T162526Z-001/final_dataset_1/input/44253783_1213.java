@Override
  public String extract(InterlokMessage message) throws CoreException {
    try {
      return load(new URLString(url(message)), message.getContentEncoding());
    } catch (IOException ex) {
      throw ExceptionHelper.wrapCoreException(ex);
    }
  }
