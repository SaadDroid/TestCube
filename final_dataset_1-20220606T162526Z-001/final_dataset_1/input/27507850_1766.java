@VisibleForTesting
  static IpSpace computeRouteMatchConditions(
      Set<AbstractRoute> routes, Map<Prefix, IpSpace> matchingIps) {
    // get the union of IpSpace that match one of the routes
    return computeRouteMatchConditionsFilter(routes, matchingIps, r -> true);
  }
