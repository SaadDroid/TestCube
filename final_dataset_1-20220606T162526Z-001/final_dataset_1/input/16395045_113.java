private static void createTable(HBaseAdmin admin, String tableName, String[] columns)
      throws IOException {
    HTableDescriptor htd = new HTableDescriptor(TableName.valueOf(tableName));
    Set<String> cfSet = new HashSet<String>();
    for (String aColumn : columns) {
      if (TsvParser.ROWKEY_COLUMN_SPEC.equals(aColumn)
          || TsvParser.TIMESTAMPKEY_COLUMN_SPEC.equals(aColumn)) continue;
      // we are only concerned with the first one (in case this is a cf:cq)
      cfSet.add(aColumn.split(":", 2)[0]);
    }
    for (String cf : cfSet) {
      HColumnDescriptor hcd = new HColumnDescriptor(Bytes.toBytes(cf));
      htd.addFamily(hcd);
    }
    LOG.warn(format("Creating table '%s' with '%s' columns and default descriptors.",
      tableName, cfSet));
    admin.createTable(htd);
  }
