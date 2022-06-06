@Override
  public String getDestination(AdaptrisMessage msg) throws CoreException {
    String destinationName = defaultDestination;
    if (msg.getObjectHeaders().containsKey(OBJ_METADATA_EXCEPTION)) {
      Exception e = (Exception) msg.getObjectHeaders().get(OBJ_METADATA_EXCEPTION);
      Throwable exc = e;
      do {
        if (exceptionMapping.contains(new KeyValuePair(exc.getClass().getName(), ""))) {
          destinationName = exceptionMapping.getValue(exc.getClass().getName());
          break;
        }
      }
      while ((exc = exc.getCause()) != null);
    }
    else {
      log.debug("No Exception in object metadata, using default destination");
    }
    log.trace("Destination found to be " + destinationName);
    return destinationName;
  }
