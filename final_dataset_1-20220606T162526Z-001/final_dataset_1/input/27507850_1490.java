@Override
  public Result execute(Environment environment) {
    if (environment.getOutputRoute() instanceof BgpRoute.Builder<?, ?>) {
      BgpRoute.Builder<?, ?> bgpRoute = (BgpRoute.Builder<?, ?>) environment.getOutputRoute();
      Set<Community> communities = _expr.asLiteralCommunities(environment);
      bgpRoute.addCommunities(communities);
      if (environment.getWriteToIntermediateBgpAttributes()) {
        environment.getIntermediateBgpAttributes().addCommunities(communities);
      }
    }
    return new Result();
  }
