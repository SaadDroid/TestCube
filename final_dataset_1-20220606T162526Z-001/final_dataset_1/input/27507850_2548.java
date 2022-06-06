@Override
  public Set<CommunityVar> visitCommunitySetMatchAll(
      CommunitySetMatchAll communitySetMatchAll, Configuration arg) {
    return visitAll(communitySetMatchAll.getExprs(), arg);
  }
