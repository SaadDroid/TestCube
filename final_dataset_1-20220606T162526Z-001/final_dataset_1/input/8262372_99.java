private TableName getTableName(RegionCoprocessorEnvironment e) {
    HRegion region = e.getRegion();
    if (region != null) {
      return getTableName(region);
    }
    return null;
  }
