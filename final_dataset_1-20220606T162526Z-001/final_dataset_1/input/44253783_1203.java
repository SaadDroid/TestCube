@Override
  public void insert(String data, InterlokMessage message) {
    message.addMessageHeader(this.getMetadataKey(), data);
  }
