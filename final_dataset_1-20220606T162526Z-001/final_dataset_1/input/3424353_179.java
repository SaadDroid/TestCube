public void processRouteCollections(TransitGraphImpl graph) {

    if (_groupRoutesByShortName) {
      createRouteShortNameRouteCollectionMapping(graph);
    } else {
      createOneToOneRouteCollectionMapping(graph);
    }

    groupRouteCollectionsByAgencyId(graph);
    graph.refreshRouteCollectionMapping();
  }
