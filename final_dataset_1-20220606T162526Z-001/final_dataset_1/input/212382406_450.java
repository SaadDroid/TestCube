public void shutdown() {
    this.state = VolumeState.NON_EXISTENT;
    if (volumeInfo != null) {
      volumeInfo.shutdownUsageThread();
    }
  }
