public Map<ServerName, List<HRegionInfo>> roundRobinAssignment(List<HRegionInfo> regions,
      List<ServerName> servers) {
    metricsBalancer.incrMiscInvocations();

    if (regions.isEmpty() || servers.isEmpty()) {
      return null;
    }
    Map<ServerName, List<HRegionInfo>> assignments = new TreeMap<ServerName, List<HRegionInfo>>();
    int numRegions = regions.size();
    int numServers = servers.size();
    int max = (int) Math.ceil((float) numRegions / numServers);
    int serverIdx = 0;
    if (numServers > 1) {
      serverIdx = RANDOM.nextInt(numServers);
    }
    int regionIdx = 0;
    for (int j = 0; j < numServers; j++) {
      ServerName server = servers.get((j + serverIdx) % numServers);
      List<HRegionInfo> serverRegions = new ArrayList<HRegionInfo>(max);
      for (int i = regionIdx; i < numRegions; i += numServers) {
        serverRegions.add(regions.get(i % numRegions));
      }
      assignments.put(server, serverRegions);
      regionIdx++;
    }
    return assignments;
  }
