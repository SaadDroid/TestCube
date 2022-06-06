public boolean delNetwork(@Nonnull String network) {
    boolean result = _idManager.deleteNetwork(network);
    if (result) {
      triggerGarbageCollection();
    }
    return result;
  }
