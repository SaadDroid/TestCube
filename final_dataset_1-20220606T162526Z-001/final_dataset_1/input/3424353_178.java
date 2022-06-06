public void processRoutes(TransitGraphImpl graph) {

    Collection<Route> routes = _gtfsDao.getAllRoutes(); 
    int numRoutes = routes.size();
    int logInterval = LoggingIntervalUtil.getAppropriateLoggingInterval(numRoutes);
    int routeIndex = 0;

    for (Route route : routes) {
    	if (routeIndex % logInterval == 0 ){
    		_log.info("route processed: " + routeIndex + "/" + numRoutes);
    	}
      routeIndex++;
      processRoute(graph, route);
    }

    graph.refreshRouteMapping();
  }
