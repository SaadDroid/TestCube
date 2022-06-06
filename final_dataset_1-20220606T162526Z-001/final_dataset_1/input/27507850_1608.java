@Override
  public @Nonnull Boolean visitCommunityMatchExprReference(
      CommunityMatchExprReference communityMatchExprReference, Community arg) {
    CommunityMatchExpr expr =
        _ctx.getCommunityMatchExprs().get(communityMatchExprReference.getName());
    // conversion to VI should guarantee expr is not null
    assert expr != null;
    return expr.accept(this, arg);
  }
