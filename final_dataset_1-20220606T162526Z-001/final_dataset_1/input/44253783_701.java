@Override
  public void doService(AdaptrisMessage msg) throws ServiceException {
    try {
      Cache cache = retrieveCache();
      for (CacheEntryEvaluator ceg : getCacheEntryEvaluators()) {
        String key = ceg.getKey(msg);
        Object value = ceg.getValue(msg);
        if (key == null || value == null) {
          log.warn("{} generated null values for either the key or value, not storing in cache", ceg.friendlyName());
          continue;
        }
        if (enforceSerializable() && !(value instanceof Serializable)) {
          throw new ServiceException("Cache value " + value + " should be Serializable, but is of type " + value.getClass());
        }
        cache.put(key, value);
      }
    }
    catch (Exception e) {
      throw ExceptionHelper.wrapServiceException(e);
    }
  }
