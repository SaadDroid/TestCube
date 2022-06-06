@Override
  public void itemEvicted(String key, Object value) {
    log.trace("Key [{}] evicted", key);
  }
