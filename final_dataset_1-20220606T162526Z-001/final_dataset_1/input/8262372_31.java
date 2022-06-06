@Override
  public HTableDescriptor get(final TableName tablename)
  throws IOException {
    invocations++;
    if (HTableDescriptor.META_TABLEDESC.getTableName().equals(tablename)) {
      cachehits++;
      return HTableDescriptor.META_TABLEDESC;
    }
    // hbase:meta is already handled. If some one tries to get the descriptor for
    // .logs, .oldlogs or .corrupt throw an exception.
    if (HConstants.HBASE_NON_USER_TABLE_DIRS.contains(tablename.getNameAsString())) {
       throw new IOException("No descriptor found for non table = " + tablename);
    }

    // Look in cache of descriptors.
    TableDescriptorAndModtime cachedtdm = this.cache.get(tablename);

    if (cachedtdm != null) {
      // Check mod time has not changed (this is trip to NN).
      if (getTableInfoModtime(tablename) <= cachedtdm.getModtime()) {
        cachehits++;
        return cachedtdm.getTableDescriptor();
      }
    }
    
    TableDescriptorAndModtime tdmt = null;
    try {
      tdmt = getTableDescriptorAndModtime(tablename);
    } catch (NullPointerException e) {
      LOG.debug("Exception during readTableDecriptor. Current table name = "
          + tablename, e);
    } catch (IOException ioe) {
      LOG.debug("Exception during readTableDecriptor. Current table name = "
          + tablename, ioe);
    }
    
    if (tdmt != null) {
      this.cache.put(tablename, tdmt);
    }
    return tdmt == null ? null : tdmt.getTableDescriptor();
  }
