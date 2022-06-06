@VisibleForTesting
  static RoutingStep buildRoutingStep(FibAction fibAction, Set<FibEntry> fibEntries) {
    RoutingStep.Builder routingStepBuilder = RoutingStep.builder();
    RoutingStepDetail.Builder routingStepDetailBuilder =
        RoutingStepDetail.builder().setRoutes(fibEntriesToRouteInfos(fibEntries));
    fibAction.accept(
        new FibActionVisitor<Void>() {
          @Override
          public Void visitFibForward(FibForward fibForward) {
            routingStepDetailBuilder.setArpIp(fibForward.getArpIp());
            routingStepDetailBuilder.setOutputInterface(fibForward.getInterfaceName());
            routingStepBuilder.setAction(FORWARDED);
            return null;
          }

          @Override
          public Void visitFibNextVrf(FibNextVrf fibNextVrf) {
            routingStepBuilder.setAction(FORWARDED_TO_NEXT_VRF);
            return null;
          }

          @Override
          public Void visitFibNullRoute(FibNullRoute fibNullRoute) {
            routingStepBuilder.setAction(NULL_ROUTED);
            return null;
          }
        });
    return routingStepBuilder.setDetail(routingStepDetailBuilder.build()).build();
  }
