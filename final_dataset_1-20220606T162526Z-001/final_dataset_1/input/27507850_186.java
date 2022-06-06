@Nonnull
  public RibDelta<R> mergeRouteGetDelta(R route) {
    RibDelta<R> delta = _tree.mergeRoute(route);
    addBackupRoute(route);
    if (!delta.isEmpty()) {
      // A change to routes has been made
      _allRoutes = null;
    }
    return delta;
  }
