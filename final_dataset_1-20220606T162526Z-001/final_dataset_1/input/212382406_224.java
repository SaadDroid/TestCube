@Override
  public int read() throws IOException {
    int byteRead = inputStream.read();
    if (statistics != null && byteRead >= 0) {
      statistics.incrementBytesRead(1);
    }
    return byteRead;
  }
