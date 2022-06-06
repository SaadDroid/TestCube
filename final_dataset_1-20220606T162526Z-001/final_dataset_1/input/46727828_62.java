@Override
  protected boolean shouldEmit(LogRecord record) {
    String value = record.getValue(field);
    if (StringUtils.equals(value, this.value))
      return false;
    else
      return true;
  }
