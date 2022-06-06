public boolean isSyncActive() {
    return currentSync.map(InProgressSync::isActive).orElse(false);
  }
