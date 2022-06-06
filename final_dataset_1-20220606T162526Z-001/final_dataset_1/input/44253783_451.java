@Override
  public boolean apply(AdaptrisMessage message, String object) {
    String contentItem = message.resolve(object);
    if (StringUtils.isEmpty(contentItem)) {
      return true;
    }
    if (isIgnoreWhitespace() && StringUtils.isBlank(contentItem)) {
      return true;
    }
    return false;
  }
