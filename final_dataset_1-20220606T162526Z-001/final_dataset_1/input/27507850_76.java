public static Collection<Edge> optimize(
      Collection<Edge> edges, Set<StateExpr> statesToKeep, boolean keepSelfLoops) {
    BDDReachabilityGraphOptimizer opt =
        new BDDReachabilityGraphOptimizer(edges, statesToKeep, keepSelfLoops);
    opt.optimize();
    return opt._edges.cellSet().stream()
        .map(cell -> new Edge(cell.getRowKey(), cell.getColumnKey(), cell.getValue()))
        .collect(ImmutableList.toImmutableList());
  }
