public Map<HRegionInfo, ServerName> immediateAssignment(List<HRegionInfo> regions,
      List<ServerName> servers) {
    metricsBalancer.incrMiscInvocations();

    Map<HRegionInfo, ServerName> assignments = new TreeMap<HRegionInfo, ServerName>();
    for (HRegionInfo region : regions) {
      assignments.put(region, randomAssignment(region, servers));
    }
    return assignments;
  }
