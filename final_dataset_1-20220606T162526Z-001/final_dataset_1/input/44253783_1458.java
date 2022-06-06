@Override
  public void stop(Collection<AdaptrisConnection> conns) {
    shutdownExecutors();
    for (AdaptrisConnection c : conns) {
      LifecycleHelper.stop(c);
    }
  }
