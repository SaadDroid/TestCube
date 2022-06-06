public Key register(Watchable watchable, Iterable<? extends WatchEvent.Kind<?>> eventTypes)
      throws IOException {
    checkOpen();
    return new Key(this, watchable, eventTypes);
  }
