@Override
  public AdaptrisMessage newMessage(byte[] payload) {
    return newMessage(defaultPayloadId(), payload, null);
  }
