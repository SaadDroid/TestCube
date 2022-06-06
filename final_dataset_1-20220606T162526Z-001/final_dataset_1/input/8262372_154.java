public void reportBadSink(SinkPeer sinkPeer) {
    ServerName serverName = sinkPeer.getServerName();
    int badReportCount = (badReportCounts.containsKey(serverName)
                    ? badReportCounts.get(serverName) : 0) + 1;
    badReportCounts.put(serverName, badReportCount);
    if (badReportCount > badSinkThreshold) {
      this.sinks.remove(serverName);
      if (sinks.isEmpty()) {
        chooseSinks();
      }
    }
  }
