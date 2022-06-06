public boolean rename (Path src, Path dst) throws IOException {
    try (Closeable context =  new TimerContextWithLog(renameTimer.time(), "rename", src, dst)) {
      return super.rename(src, dst);
    }
  }
