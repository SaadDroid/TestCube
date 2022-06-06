public long getPermits(long requestedPermits, long minPermits, long timeoutMillis) {
    PermitsAndDelay permitsAndDelay = getPermitsAndDelay(requestedPermits, minPermits, timeoutMillis);
    if (permitsAndDelay.delay > 0) {
      try {
        Thread.sleep(permitsAndDelay.delay);
      } catch (InterruptedException ie) {
        return 0;
      }
    }
    return permitsAndDelay.permits;
  }
