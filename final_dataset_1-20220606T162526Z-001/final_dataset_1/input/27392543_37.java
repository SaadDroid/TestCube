@Override
  public void close() throws IOException {
    try {
      waitForTasks();
    } finally {
      ExecutorsUtils.shutdownExecutorService(this.executor, Optional.of(LOGGER));
    }
  }
