@Override
  public void write(int b) {
    try {
      buffer.write(b);
      if (buffer.size() >= bufferSize) {
        flushBuffer(false);
      }
    } catch (Exception ex) {
      responseObserver.onError(ex);
    }
  }
