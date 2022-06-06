@PreDestroy
  public void stop() {
    _log.debug("stop");
    _executor.shutdown();
  }
