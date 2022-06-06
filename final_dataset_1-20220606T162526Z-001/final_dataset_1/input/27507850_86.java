private Map<String, List<BDDFirewallSessionTraceInfo>> computeInitializedSessions() {
    return _configs.values().stream()
        .flatMap(
            config -> {
              List<BDDFirewallSessionTraceInfo> sessions = computeInitializedSessions(config);
              return sessions.isEmpty()
                  ? Stream.of()
                  : Stream.of(Maps.immutableEntry(config.getHostname(), sessions));
            })
        .collect(ImmutableMap.toImmutableMap(Entry::getKey, Entry::getValue));
  }
