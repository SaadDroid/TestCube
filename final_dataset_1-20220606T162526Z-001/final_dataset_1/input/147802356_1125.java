@Override
  public SafeFuture<SyncResult> syncToChain(final TargetChain targetChain) {
    final SafeFuture<SyncResult> result = new SafeFuture<>();
    eventThread.execute(() -> switchSyncTarget(targetChain, result));
    return result;
  }
