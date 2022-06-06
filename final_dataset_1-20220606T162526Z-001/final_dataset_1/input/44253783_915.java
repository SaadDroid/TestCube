@Override
  public Map createParameters(AdaptrisMessage msg, Map existingParams) throws ServiceException {
    if (isEmpty(getObjectMetadataKeyRegexp())) {
      throw new ServiceException("Object Metadata Key regexp is empty");
    }
    Pattern pattern = Pattern.compile(getObjectMetadataKeyRegexp());
    Map params = existingParams == null ? new HashMap() : new HashMap(existingParams);
    Map objMetadata = msg.getObjectHeaders();
    for (Object key : objMetadata.keySet()) {
      if (pattern.matcher(key.toString()).matches()) {
        params.put(key.toString(), objMetadata.get(key));
        log.trace("Adding object metadata against [{}]", key.toString());
      }
    }
    return params;
  }
