@Override
  public void preStopRegionServer(
      ObserverContext<RegionServerCoprocessorEnvironment> env)
      throws IOException {
    requirePermission("preStopRegionServer", Action.ADMIN);
  }
