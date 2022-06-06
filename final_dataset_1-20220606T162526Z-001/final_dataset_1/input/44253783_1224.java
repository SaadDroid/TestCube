@Override
  public void insert(String data, InterlokMessage message) throws CoreException {
    try {
      URL url = FsHelper.createUrlFromString(this.url(message), true);
      try (OutputStream out = new FileOutputStream(FsHelper.createFileReference(url))) {
        IOUtils.write(data, out, message.getContentEncoding());
      }
    } catch (Exception e) {
      throw ExceptionHelper.wrapCoreException(e);
    }
  }
