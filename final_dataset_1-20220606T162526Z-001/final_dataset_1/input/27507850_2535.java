@Override
  public Set<CommunityVar> visitAddCommunity(AddCommunity addCommunity, Configuration arg) {
    return CommunityVarCollector.collectCommunityVars(arg, addCommunity.getExpr());
  }
