static Map<String, Multimap<String, FirewallSessionTraceInfo>> buildSessionsByOriginatingVrf(
      @Nullable Set<FirewallSessionTraceInfo> sessions) {
    if (sessions == null) {
      return ImmutableMap.of();
    }

    Map<String, ImmutableMultimap.Builder<String, FirewallSessionTraceInfo>> builder =
        new HashMap<>();
    sessions.forEach(
        session ->
            session
                .getSessionScope()
                .accept(
                    new SessionScopeVisitor<Void>() {
                      @Override
                      public Void visitIncomingSessionScope(
                          IncomingSessionScope incomingSessionScope) {
                        return null;
                      }

                      @Override
                      public Void visitOriginatingSessionScope(
                          OriginatingSessionScope originatingSessionScope) {
                        builder
                            .computeIfAbsent(
                                session.getHostname(), k -> ImmutableMultimap.builder())
                            .put(originatingSessionScope.getOriginatingVrf(), session);
                        return null;
                      }
                    }));
    return builder.entrySet().stream()
        .collect(ImmutableMap.toImmutableMap(Entry::getKey, e -> e.getValue().build()));
  }
