public static PortfolioNodeTraverser breadthFirst(final PortfolioNodeTraversalCallback callback) {
    return new BreadthFirstPortfolioNodeTraverser(callback);
  }
