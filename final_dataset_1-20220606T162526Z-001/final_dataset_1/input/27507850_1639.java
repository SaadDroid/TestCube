@Override
  public @Nonnull Result execute(Environment environment) {
    CommunityContext ctx = CommunityContext.fromEnvironment(environment);
    CommunitySet communitySet = _communitySetExpr.accept(CommunitySetExprEvaluator.instance(), ctx);
    BgpRoute.Builder<?, ?> bgpRoute = (BgpRoute.Builder<?, ?>) environment.getOutputRoute();
    Set<Community> communities = communitySet.getCommunities();
    bgpRoute.setCommunities(communities);
    if (environment.getWriteToIntermediateBgpAttributes()) {
      environment.getIntermediateBgpAttributes().setCommunities(communities);
    }
    return new Result();
  }
