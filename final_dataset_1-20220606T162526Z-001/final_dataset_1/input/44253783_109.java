@Override
  public String create(Object msg) {
    return host + getSeparator() + (msg == null ? "0" : Integer.toHexString(msg.hashCode())) + getSeparator()
        + System.currentTimeMillis();
  }
