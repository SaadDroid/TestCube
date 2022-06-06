@Nonnull
  @VisibleForTesting
  Stream<Edge> fibLookupSessionEdges(BDDFirewallSessionTraceInfo sessionInfo) {
    return sessionInfo
        .getAction()
        .accept(
            new SessionActionVisitor<Stream<Edge>>() {
              @Override
              public Stream<Edge> visitAcceptVrf(Accept acceptVrf) {
                return Stream.of();
              }

              @Override
              public Stream<Edge> visitFibLookup(FibLookup fibLookup) {
                return computeFibLookupSessionEdges(sessionInfo);
              }

              @Override
              public Stream<Edge> visitForwardOutInterface(
                  ForwardOutInterface forwardOutInterface) {
                return Stream.of();
              }
            });
  }
