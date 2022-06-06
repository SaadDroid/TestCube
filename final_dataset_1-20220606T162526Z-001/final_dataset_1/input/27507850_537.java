private static List<Statement> getAcceptStatements(BgpNeighbor neighbor, BgpVrf bgpVrf) {
    ImmutableList.Builder<Statement> acceptStatements = ImmutableList.builder();
    SetNextHop setNextHop = getSetNextHop(neighbor, bgpVrf);
    SetMetric setMaxMedMetric = getSetMaxMedMetric(bgpVrf);

    if (setNextHop != null) {
      acceptStatements.add(setNextHop);
    }
    if (setMaxMedMetric != null) {
      acceptStatements.add(setMaxMedMetric);
    }
    acceptStatements.add(Statements.ExitAccept.toStaticStatement());

    return acceptStatements.build();
  }
