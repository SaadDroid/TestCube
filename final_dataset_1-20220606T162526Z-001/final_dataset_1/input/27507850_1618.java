@Override
  public Boolean visitStandardCommunityLowMatch(
      StandardCommunityLowMatch standardCommunityLowMatch, Community arg) {
    if (!(arg instanceof StandardCommunity)) {
      return false;
    }
    return standardCommunityLowMatch
        .getExpr()
        .accept(IntMatchExprEvaluator.instance(), new LiteralInt(((StandardCommunity) arg).low()));
  }
