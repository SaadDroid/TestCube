private int getValue(String key, AdaptrisMessage msg) {
    if (!msg.headersContainsKey(key)) {
      return 0;
    }
    return Integer.parseInt(msg.getMetadataValue(key));
  }
