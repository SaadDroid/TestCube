protected void init() throws IOException, ReplicationException {
    for (String id : this.replicationPeers.getConnectedPeers()) {
      addSource(id);
    }
    List<String> currentReplicators = this.replicationQueues.getListOfReplicators();
    if (currentReplicators == null || currentReplicators.size() == 0) {
      return;
    }
    List<String> otherRegionServers = replicationTracker.getListOfRegionServers();
    LOG.info("Current list of replicators: " + currentReplicators + " other RSs: "
        + otherRegionServers);

    // Look if there's anything to process after a restart
    for (String rs : currentReplicators) {
      if (!otherRegionServers.contains(rs)) {
        transferQueues(rs);
      }
    }
  }
