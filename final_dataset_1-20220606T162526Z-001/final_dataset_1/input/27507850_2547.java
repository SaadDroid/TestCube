@Override
  public Set<CommunityVar> visitCommunitySetAcl(
      CommunitySetAcl communitySetAcl, Configuration arg) {
    return visitAll(
        communitySetAcl.getLines().stream()
            .map(CommunitySetAclLine::getCommunitySetMatchExpr)
            .collect(ImmutableList.toImmutableList()),
        arg);
  }
