@Override
  public void preFlush(ObserverContext<RegionCoprocessorEnvironment> e) throws IOException {
    requirePermission("flush", getTableName(e.getEnvironment()), null, null, Action.ADMIN);
  }
