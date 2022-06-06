static boolean isMetaTableUpdated(final CatalogTracker catalogTracker) throws IOException {
    List<Result> results = MetaReader.fullScanOfMeta(catalogTracker);
    if (results == null || results.isEmpty()) {
      LOG.info("hbase:meta doesn't have any entries to update.");
      return true;
    }
    for (Result r : results) {
      byte[] value = r.getValue(HConstants.CATALOG_FAMILY, HConstants.REGIONINFO_QUALIFIER);
      if (!isMigrated(value)) {
        return false;
      }
    }
    return true;
  }
