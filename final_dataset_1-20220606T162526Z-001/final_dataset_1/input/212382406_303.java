public Node getNode(String loc) {
    loc = NetUtils.normalize(loc);
    netlock.readLock().lock();
    try {
      if (!ROOT.equals(loc)) {
        return clusterTree.getNode(loc);
      } else {
        return clusterTree;
      }
    } finally {
      netlock.readLock().unlock();
    }
  }
