@VisibleForTesting
  static Map<String, Map<String, Map<Edge, IpSpace>>> computeArpTrueEdgeNextHopIp(
      Map<String, Map<String, Map<Prefix, IpSpace>>> matchingIps,
      Map<String, Map<String, Map<Edge, Set<AbstractRoute>>>> routesWithNextHopIpArpTrue) {
    Span span =
        GlobalTracer.get().buildSpan("ForwardingAnalysisImpl.computeArpTrueEdgeNextHopIp").start();
    try (Scope scope = GlobalTracer.get().scopeManager().activate(span)) {
      assert scope != null; // avoid unused warning
      return toImmutableMap(
          routesWithNextHopIpArpTrue,
          Entry::getKey, // node
          nodeEntry ->
              toImmutableMap(
                  nodeEntry.getValue(),
                  Entry::getKey, // vrf
                  vrfEntry ->
                      vrfEntry.getValue().entrySet().stream()
                          .collect(
                              ImmutableMap.toImmutableMap(
                                  Entry::getKey, // edge
                                  edgeEntry -> {
                                    String hostname = nodeEntry.getKey();
                                    String vrf = vrfEntry.getKey();
                                    Set<AbstractRoute> routes = edgeEntry.getValue();
                                    return computeRouteMatchConditions(
                                        routes, matchingIps.get(hostname).get(vrf));
                                  }))));
    } finally {
      span.finish();
    }
  }
