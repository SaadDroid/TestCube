public static Multiset<Row> diffFlowTracesToRows(
      Map<Flow, List<Trace>> baseFlowTraces,
      Map<Flow, List<Trace>> deltaFlowTraces,
      int maxTraces) {
    Multiset<Row> rows = LinkedHashMultiset.create();
    checkArgument(
        baseFlowTraces.keySet().equals(deltaFlowTraces.keySet()),
        "Base and delta flow traces should have same flows");
    for (Flow flow : baseFlowTraces.keySet()) {
      rows.add(
          Row.of(
              COL_FLOW,
              flow,
              TableDiff.baseColumnName(COL_TRACES),
              TracePruner.prune(baseFlowTraces.get(flow), maxTraces),
              TableDiff.baseColumnName(COL_TRACE_COUNT),
              baseFlowTraces.get(flow).size(),
              TableDiff.deltaColumnName(COL_TRACES),
              TracePruner.prune(deltaFlowTraces.get(flow), maxTraces),
              TableDiff.deltaColumnName(COL_TRACE_COUNT),
              deltaFlowTraces.get(flow).size()));
    }
    return rows;
  }
