public ZKInterProcessWriteLock writeLock(byte[] metadata) {
    return new ZKInterProcessWriteLock(zkWatcher, znode, metadata, handler);
  }
