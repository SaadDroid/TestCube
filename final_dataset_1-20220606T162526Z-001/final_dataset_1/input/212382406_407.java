public boolean isKnownDatanode(UUID datanodeID) {
    Preconditions.checkNotNull(datanodeID);
    return scmNodeStorageReportMap.containsKey(datanodeID);
  }
