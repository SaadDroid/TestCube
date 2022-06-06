@Override
  public long evaluate(Environment environment) {
    Direction direction = environment.getDirection();
    if (direction == Direction.IN) {
      AsPath asPath;
      if (environment.getUseOutputAttributes()
          && environment.getOutputRoute() instanceof BgpRoute.Builder<?, ?>) {
        BgpRoute.Builder<?, ?> bgpRouteBuilder =
            (BgpRoute.Builder<?, ?>) environment.getOutputRoute();
        asPath = bgpRouteBuilder.getAsPath();
      } else if (environment.getReadFromIntermediateBgpAttributes()) {
        asPath = environment.getIntermediateBgpAttributes().getAsPath();
      } else {
        // caller should guarantee this holds if this branch is reached
        assert environment.getOriginalRoute() instanceof BgpRoute;
        BgpRoute<?, ?> bgpRoute = (BgpRoute<?, ?>) environment.getOriginalRoute();
        asPath = bgpRoute.getAsPath();
      }
      // really should not receive empty as-path in route from neighbor
      List<AsSet> asSets = asPath.getAsSets();
      assert !asSets.isEmpty();
      SortedSet<Long> firstAsSetAsns = asSets.get(0).getAsns();
      // TODO: see if clients of AsExpr should really be provided the entire AsSet instead of a
      // single AS
      assert firstAsSetAsns.size() == 1;
      // for now, arbitrarily use lowest AS in set
      return firstAsSetAsns.first();
    }
    assert direction == Direction.OUT;
    BgpSessionProperties sessionProps = environment.getBgpSessionProperties();
    checkState(sessionProps != null, "Expected BGP session properties");
    return sessionProps.getHeadAs();
  }
