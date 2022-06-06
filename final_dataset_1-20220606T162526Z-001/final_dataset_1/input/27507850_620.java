@VisibleForTesting
  static IpAccessList computeServicePrefixFilter(IpSpace servicePrefixSpace) {
    return IpAccessList.builder()
        .setName(SERVICE_PREFIX_FILTER)
        .setLines(
            ExprAclLine.builder()
                .setTraceElement(PERMIT_SERVICE_IPS)
                .setMatchCondition(
                    new MatchHeaderSpace(
                        HeaderSpace.builder().setDstIps(servicePrefixSpace).build()))
                .setAction(LineAction.PERMIT)
                .build(),
            ExprAclLine.builder()
                .setTraceElement(DENY_NON_SERVICE_IPS)
                .setMatchCondition(TrueExpr.INSTANCE)
                .setAction(LineAction.DENY)
                .build())
        .build();
  }
