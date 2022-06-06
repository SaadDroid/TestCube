@Override
  public boolean apply(AdaptrisMessage message, String object) {
    return !(super.apply(message, object));
  }
