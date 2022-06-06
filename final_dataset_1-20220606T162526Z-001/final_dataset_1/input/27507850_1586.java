@Override
  public @Nonnull Result evaluate(Environment environment) {
    CommunityContext ctx = CommunityContext.fromEnvironment(environment);
    CommunitySet communitySet = _communitySetExpr.accept(CommunitySetExprEvaluator.instance(), ctx);
    boolean ret =
        _communitySetMatchExpr.accept(ctx.getCommunitySetMatchExprEvaluator(), communitySet);
    return Result.builder().setBooleanValue(ret).build();
  }
