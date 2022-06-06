@Override
  public Set<CommunityVar> visitStandardCommunityHighMatch(
      StandardCommunityHighMatch standardCommunityHighMatch, Configuration arg) {
    int high = intMatchExprToInt(standardCommunityHighMatch.getExpr());
    return ImmutableSet.of(CommunityVar.from("^" + high + ":"));
  }
