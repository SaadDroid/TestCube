@Override
  public Closeable acquirePermits(long permits) throws InterruptedException {
    Closer closer = Closer.create();
    for (Limiter limiter : this.underlyingLimiters) {
      Closeable permit = limiter.acquirePermits(permits);
      if (permit == null) {
        try {
          closer.close();
        } catch (IOException ioe) {
          throw new RuntimeException("Could not return intermediate permits.");
        }
        return null;
      }
      closer.register(permit);
    }
    return closer;
  }
