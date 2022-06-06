@Override
  public Set<CommunityVar> visitCommunityNot(CommunityNot communityNot, Configuration arg) {
    return communityNot.getExpr().accept(this, arg);
  }
