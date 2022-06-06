public Collection<AdaptrisConnection> removeConnection(String id) {
    List<AdaptrisConnection> keep = new ArrayList<>();
    List<AdaptrisConnection> remove = new ArrayList<>();
    for (AdaptrisConnection c : connections) {
      if (c.getUniqueId().equals(id)) {
        remove.add(c);
      }
      else {
        keep.add(c);
      }
    }
    setConnections(keep);
    // unbind them from JNDI as well
    unbindQuietly(remove);
    return remove;
  }
