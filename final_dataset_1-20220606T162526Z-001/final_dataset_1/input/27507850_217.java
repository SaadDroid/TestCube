public static <R extends AbstractRouteDecorator> boolean shouldActivateNextHopIpRoute(
      @Nonnull StaticRoute route, @Nonnull GenericRib<R> rib) {
    Set<R> matchingRoutes = rib.longestPrefixMatch(route.getNextHopIp());

    // If matchingRoutes is empty, cannot activate because next hop ip is unreachable
    return matchingRoutes.stream()
        .map(AbstractRouteDecorator::getAbstractRoute)
        .anyMatch(
            routeToNextHop ->
                // Next hop has to be reachable through a route with a different prefix
                !routeToNextHop.getNetwork().equals(route.getNetwork())
                    || route.equals(routeToNextHop));
  }
