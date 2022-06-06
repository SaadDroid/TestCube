public void setOwner(Path f, String user, String group) throws IOException {
    try (Closeable context = new TimerContextWithLog(this.setOwnerTimer.time(), "setOwner", f, user, group)) {
      super.setOwner(f, user, group);
    }
  }
