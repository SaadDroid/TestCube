public Bitmap get() throws IOException {
    long started = System.nanoTime();
    checkNotMain();

    if (deferred) {
      throw new IllegalStateException("Fit cannot be used with get.");
    }
    if (!data.hasImage()) {
      return null;
    }

    Request finalData = createRequest(started);
    String key = createKey(finalData, new StringBuilder());

    Action action = new GetAction(picasso, finalData, memoryPolicy, networkPolicy, tag, key);
    return forRequest(picasso, picasso.dispatcher, picasso.cache, picasso.stats, action).hunt();
  }
