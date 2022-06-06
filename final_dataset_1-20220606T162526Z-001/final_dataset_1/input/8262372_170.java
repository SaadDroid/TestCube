Map<HRegionInfo, ServerName[]> placeSecondaryAndTertiaryRS(
      Map<HRegionInfo, ServerName> primaryRSMap) {
    Map<HRegionInfo, ServerName[]> secondaryAndTertiaryMap =
        new HashMap<HRegionInfo, ServerName[]>();
    for (Map.Entry<HRegionInfo, ServerName> entry : primaryRSMap.entrySet()) {
      // Get the target region and its primary region server rack
      HRegionInfo regionInfo = entry.getKey();
      ServerName primaryRS = entry.getValue();
      try {
        // Create the secondary and tertiary region server pair object.
        ServerName[] favoredNodes;
        // Get the rack for the primary region server
        String primaryRack = rackManager.getRack(primaryRS);

        if (getTotalNumberOfRacks() == 1) {
          favoredNodes = singleRackCase(regionInfo, primaryRS, primaryRack);
        } else {
          favoredNodes = multiRackCase(regionInfo, primaryRS, primaryRack);
        }
        if (favoredNodes != null) {
          secondaryAndTertiaryMap.put(regionInfo, favoredNodes);
          LOG.debug("Place the secondary and tertiary region server for region "
              + regionInfo.getRegionNameAsString());
        }
      } catch (Exception e) {
        LOG.warn("Cannot place the favored nodes for region " +
            regionInfo.getRegionNameAsString() + " because " + e, e);
        continue;
      }
    }
    return secondaryAndTertiaryMap;
  }
