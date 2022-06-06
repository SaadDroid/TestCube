@Override
  public synchronized void close() throws IOException {
    if (isOpen()) {
      fileSystemState.unregister(this);
      file.closed();

      // file is set to null here and only here
      file = null;
    }
  }
