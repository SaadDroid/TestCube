@Override
  public void doService(AdaptrisMessage msg) throws ServiceException {
    try {
      Cache cache = retrieveCache();
      String key = msg.resolve(getKey());
      Object value = cache.get(key);
      if (value != null || !exceptionIfNotFound()) {
        getValueTranslator().addValueToMessage(msg, value);
      } else {
        throw new ServiceException(String.format("%s not found in cache", key));
      }
    } catch (Exception e) {
      throw ExceptionHelper.wrapServiceException(e);
    }
  }
