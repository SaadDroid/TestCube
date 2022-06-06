@VisibleForTesting
  static Row eigrpEdgeToRow(EigrpEdge eigrpEdge) {
    RowBuilder row = Row.builder();
    row.put(
            COL_INTERFACE,
            NodeInterfacePair.of(
                eigrpEdge.getNode1().getHostname(), eigrpEdge.getNode1().getInterfaceName()))
        .put(
            COL_REMOTE_INTERFACE,
            NodeInterfacePair.of(
                eigrpEdge.getNode2().getHostname(), eigrpEdge.getNode2().getInterfaceName()));
    return row.build();
  }
