@Override
  public void ping(final PingCallback callback, Executor executor) {
    checkState(frameWriter != null);
    long data = 0;
    Http2Ping p;
    boolean writePing;
    synchronized (lock) {
      if (stopped) {
        Http2Ping.notifyFailed(callback, executor, getPingFailure());
        return;
      }
      if (ping != null) {
        // we only allow one outstanding ping at a time, so just add the callback to
        // any outstanding operation
        p = ping;
        writePing = false;
      } else {
        // set outstanding operation and then write the ping after releasing lock
        data = random.nextLong();
        p = ping = new Http2Ping(data, Stopwatch.createStarted(ticker));
        writePing = true;
      }
    }
    if (writePing) {
      frameWriter.ping(false, (int) (data >>> 32), (int) data);
    }
    // If transport concurrently failed/stopped since we released the lock above, this could
    // immediately invoke callback (which we shouldn't do while holding a lock)
    p.addCallback(callback, executor);
  }
