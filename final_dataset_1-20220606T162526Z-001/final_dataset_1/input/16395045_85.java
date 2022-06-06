@Override
  public InternalScanner preCompact(ObserverContext<RegionCoprocessorEnvironment> e,
      final Store store, final InternalScanner scanner, final ScanType scanType)
          throws IOException {
    requirePermission("compact", getTableName(e.getEnvironment()), null, null, Action.ADMIN);
    return scanner;
  }
