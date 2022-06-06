private TableName getTableName(RegionCoprocessorEnvironment e) {
    HRegion region = e.getRegion();
    TableName tableName = null;

    if (region != null) {
      HRegionInfo regionInfo = region.getRegionInfo();
      if (regionInfo != null) {
        tableName = regionInfo.getTable();
      }
    }
    return tableName;
  }
