boolean cleanParent(final HRegionInfo parent, Result rowContent)
  throws IOException {
    boolean result = false;
    // Check whether it is a merged region and not clean reference
    // No necessary to check MERGEB_QUALIFIER because these two qualifiers will
    // be inserted/deleted together
    if (rowContent.getValue(HConstants.CATALOG_FAMILY,
        HConstants.MERGEA_QUALIFIER) != null) {
      // wait cleaning merge region first
      return result;
    }
    // Run checks on each daughter split.
    PairOfSameType<HRegionInfo> daughters = HRegionInfo.getDaughterRegions(rowContent);
    Pair<Boolean, Boolean> a = checkDaughterInFs(parent, daughters.getFirst());
    Pair<Boolean, Boolean> b = checkDaughterInFs(parent, daughters.getSecond());
    if (hasNoReferences(a) && hasNoReferences(b)) {
      LOG.debug("Deleting region " + parent.getRegionNameAsString() +
        " because daughter splits no longer hold references");
      FileSystem fs = this.services.getMasterFileSystem().getFileSystem();
      if (LOG.isTraceEnabled()) LOG.trace("Archiving parent region: " + parent);
      HFileArchiver.archiveRegion(this.services.getConfiguration(), fs, parent);
      MetaEditor.deleteRegion(this.server.getCatalogTracker(), parent);
      result = true;
    }
    return result;
  }
