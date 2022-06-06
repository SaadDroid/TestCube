@Override public void clear() {
    assertNotClosed();
    cache.asMap().clear();
  }
