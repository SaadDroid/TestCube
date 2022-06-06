static Multiset<Row> getBgpRouteRowsDiff(
      List<DiffRoutesOutput> diffRoutesList, RibProtocol ribProtocol) {
    Multiset<Row> rows = HashMultiset.create();
    Map<String, ColumnMetadata> columnMetadataMap = getDiffTableMetadata(ribProtocol).toColumnMap();
    for (DiffRoutesOutput diffRoutesOutput : diffRoutesList) {
      RouteRowKey routeRowKey = diffRoutesOutput.getRouteRowKey();
      String hostName = routeRowKey.getHostName();
      String vrfName = routeRowKey.getVrfName();
      Prefix network = routeRowKey.getPrefix();
      RouteRowSecondaryKey routeRowSecondaryKey = diffRoutesOutput.getRouteRowSecondaryKey();
      KeyPresenceStatus secondaryKeyPresenceStatus =
          diffRoutesOutput.getRouteRowSecondaryKeyStatus();

      for (List<RouteRowAttribute> routeRowAttributeInBaseAndRef :
          diffRoutesOutput.getDiffInAttributes()) {
        Row.RowBuilder rowBuilder = Row.builder(columnMetadataMap);
        rowBuilder
            .put(COL_NODE, new Node(hostName))
            .put(COL_VRF_NAME, vrfName)
            .put(COL_NETWORK, network);

        RouteRowAttribute routeRowAttributeBase = routeRowAttributeInBaseAndRef.get(0);
        RouteRowAttribute routeRowAttributeRef = routeRowAttributeInBaseAndRef.get(1);

        rowBuilder.put(
            COL_ROUTE_ENTRY_PRESENCE,
            getRouteEntryPresence(
                secondaryKeyPresenceStatus, routeRowAttributeBase, routeRowAttributeRef));

        populateSecondaryKeyAttrs(routeRowSecondaryKey, secondaryKeyPresenceStatus, rowBuilder);
        populateBgpRouteAttributes(rowBuilder, routeRowAttributeBase, true);
        populateBgpRouteAttributes(rowBuilder, routeRowAttributeRef, false);

        rows.add(rowBuilder.build());
      }
    }
    return rows;
  }
