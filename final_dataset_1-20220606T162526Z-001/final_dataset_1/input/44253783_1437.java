@Override
  public void applyOutputParam(Object dbValue, AdaptrisMessage msg) throws JdbcParameterException {
    super.checkMetadataKey();
    
    msg.addObjectHeader(this.getMetadataKey(), normalize(dbValue));
  }
