@Override
  public void close() {
    try {
      if (unprocessed != null) {
        unprocessed.close();
      }
      if (nextFrame != null) {
        nextFrame.close();
      }
    } finally {
      unprocessed = null;
      nextFrame = null;
    }
  }
