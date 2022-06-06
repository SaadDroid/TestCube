@Override
  public @Nonnull Boolean visitCommunitySetMatchExprReference(
      CommunitySetMatchExprReference communitySetMatchExprReference, CommunitySet arg) {
    CommunitySetMatchExpr expr =
        _ctx.getCommunitySetMatchExprs().get(communitySetMatchExprReference.getName());
    // conversion to VI should guarantee expr is not null
    assert expr != null;
    return expr.accept(this, arg);
  }
