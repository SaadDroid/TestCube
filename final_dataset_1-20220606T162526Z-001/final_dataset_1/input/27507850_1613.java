@Override
  public Boolean visitExtendedCommunityGlobalAdministratorMatch(
      ExtendedCommunityGlobalAdministratorMatch extendedCommunityGlobalAdministratorMatch,
      Community arg) {
    if (!(arg instanceof ExtendedCommunity)) {
      return false;
    }
    return extendedCommunityGlobalAdministratorMatch
        .getExpr()
        .accept(
            LongMatchExprEvaluator.instance(),
            new LiteralLong(((ExtendedCommunity) arg).getGlobalAdministrator()));
  }
