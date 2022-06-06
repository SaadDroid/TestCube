@Override
  public byte[] serialize( String topic, T data ) {
    return data.toByteArray();
  }
