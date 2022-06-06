@VisibleForTesting
  boolean isSyncActive() {
    final SyncState syncState = syncStateTracker.getCurrentSyncState();
    return syncState.isStartingUp() || (syncState.isSyncing() && headBlockIsTooFarBehind());
  }
