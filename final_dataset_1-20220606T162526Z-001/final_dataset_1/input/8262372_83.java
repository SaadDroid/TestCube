@Override
  public void preSplit(ObserverContext<RegionCoprocessorEnvironment> e) throws IOException {
    requirePermission("split", getTableName(e.getEnvironment()), null, null, Action.ADMIN);
  }
