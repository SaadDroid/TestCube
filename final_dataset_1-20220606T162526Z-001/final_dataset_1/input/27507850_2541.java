@Override
  public Set<CommunityVar> visitCommunityExprsSet(
      CommunityExprsSet communityExprsSet, Configuration arg) {
    ImmutableSet.Builder<CommunityVar> builder = ImmutableSet.builder();
    Set<CommunityExpr> exprs = communityExprsSet.getExprs();
    for (CommunityExpr expr : exprs) {
      Community c = expr.accept(CommunityExprEvaluator.instance(), configToCommunityContext(arg));
      builder.add(CommunityVar.from(c));
    }
    return builder.build();
  }
