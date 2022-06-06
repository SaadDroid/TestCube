@VisibleForTesting
  synchronized boolean isPolling() {
    return pollingFuture != null;
  }
