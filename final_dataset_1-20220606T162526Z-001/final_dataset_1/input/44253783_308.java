public static void waitQuietly(long ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException | IllegalArgumentException e) {
    }
  }
