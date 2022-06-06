public synchronized List<QueuedWork> getCompletedWork(
      NetworkId networkId, SnapshotId snapshotId) {
    ImmutableList.Builder<QueuedWork> b = ImmutableList.builder();
    for (QueuedWork work : _queueCompletedWork) {
      if (work.getDetails().getNetworkId().equals(networkId)
          && work.getDetails().getSnapshotId().equals(snapshotId)) {
        b.add(work);
      }
    }
    return b.build();
  }
