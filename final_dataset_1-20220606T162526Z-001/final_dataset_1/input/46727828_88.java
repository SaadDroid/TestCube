@Override
  protected void process(LogRecord record) {
    record.addMetadataValue(field, value);
  }
