public void init() throws CoreException {
    try {
      Args.notNull(getMetadataElement(), "metadataElement");
      super.init();
    }
    catch (Exception e) {
      throw ExceptionHelper.wrapCoreException(e);
    }
  }
