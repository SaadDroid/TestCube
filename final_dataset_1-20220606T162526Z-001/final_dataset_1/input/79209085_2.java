@Override boolean shouldRetry(boolean airplaneMode, NetworkInfo info) {
    return info == null || info.isConnected();
  }
