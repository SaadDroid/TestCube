public Multimap<byte[], HbckInfo> getOverlapGroups(
      TableName table) {
    TableInfo ti = tablesInfo.get(table);
    return ti.overlapGroups;
  }
