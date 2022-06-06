@Override
  public void processCorrelationId(AdaptrisMessage src, Message dest) throws JMSException {
    String correlationId = src.getMetadataValue(getMetadataKey());
    if (isEmpty(correlationId)) {
      log.warn("no value for metadata key [{}]", getMetadataKey());
    }
    else {
      dest.setJMSCorrelationID(correlationId);
      log.debug("set correlation ID to [{}]", correlationId);
    }
  }
