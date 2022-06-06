@Override
  public void uncaughtException(Thread t, Throwable e) {
    this.logger.error(String.format("Thread %s threw an uncaught exception: %s", t, e), e);
  }
