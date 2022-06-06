@Override
  public void doService(AdaptrisMessage msg) throws ServiceException {
    try {
      String value = msg.getMetadataValue(getMetadataKey());
      Args.notBlank(value, "metadataKey");
      previousValuesStore.add(value);
      while (previousValuesStore.size() > getNumberOfPreviousValuesToStore()) {
        previousValuesStore.remove(0);
      }
      storePreviouslyReceivedValues();
    }
    catch (Exception e) {
      throw ExceptionHelper.wrapServiceException(e);
    }
  }
