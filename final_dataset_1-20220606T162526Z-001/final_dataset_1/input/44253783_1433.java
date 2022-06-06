@Override
  public Object applyInputParam(AdaptrisMessage msg) throws JdbcParameterException {
    super.checkMetadataKey();
    
    @SuppressWarnings("unchecked")
    Map<Object, Object> objectMetadata = (Map<Object, Object>) msg.getObjectHeaders();
    
    if(!objectMetadata.containsKey(getMetadataKey()))
      throw new JdbcParameterException("Object metadata does not exist for key: " + this.getMetadataKey());

    return normalize(objectMetadata.get(this.getMetadataKey()));
  }
