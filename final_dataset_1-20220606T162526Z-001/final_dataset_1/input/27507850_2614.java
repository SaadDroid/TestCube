public static Multiset<Row> flowTracesToRows(
      SortedMap<Flow, List<Trace>> flowTraces, int maxTraces) {
    Multiset<Row> rows = LinkedHashMultiset.create();
    for (Map.Entry<Flow, List<Trace>> flowTrace : flowTraces.entrySet()) {
      List<Trace> traces = flowTrace.getValue();
      List<Trace> prunedTraces = TracePruner.prune(traces, maxTraces);
      rows.add(
          Row.of(
              COL_FLOW,
              flowTrace.getKey(),
              COL_TRACES,
              prunedTraces,
              COL_TRACE_COUNT,
              traces.size()));
    }
    return rows;
  }
