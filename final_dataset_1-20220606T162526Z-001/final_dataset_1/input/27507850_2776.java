@VisibleForTesting
  static TableMetadata getDiffTableMetadata(RibProtocol rib) {
    ImmutableList.Builder<ColumnMetadata> columnBuilder = ImmutableList.builder();
    addCommonTableColumnsAtStart(columnBuilder);
    columnBuilder.add(
        new ColumnMetadata(
            COL_ROUTE_ENTRY_PRESENCE,
            Schema.STRING,
            "Presence of a Route for the given Network (Prefix)",
            Boolean.FALSE,
            Boolean.TRUE));
    switch (rib) {
      case BGP:
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_NEXT_HOP_IP,
                Schema.IP,
                "Route's Next Hop IP",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_NEXT_HOP_IP,
                Schema.IP,
                "Route's Next Hop IP",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_PROTOCOL,
                Schema.STRING,
                "Route's Protocol",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_PROTOCOL,
                Schema.STRING,
                "Route's Protocol",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_AS_PATH,
                Schema.STRING,
                "Route's AS path",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_AS_PATH,
                Schema.STRING,
                "Route's AS path",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_METRIC,
                Schema.LONG,
                "Route's Metric",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_METRIC,
                Schema.LONG,
                "Route's Metric",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_LOCAL_PREF,
                Schema.LONG,
                "Route's Local Preference",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_LOCAL_PREF,
                Schema.LONG,
                "Route's Local Preference",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_COMMUNITIES,
                Schema.list(Schema.STRING),
                "Route's List of communities",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_COMMUNITIES,
                Schema.list(Schema.STRING),
                "Route's List of communities",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_ORIGIN_PROTOCOL,
                Schema.STRING,
                "Route's Origin protocol",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_ORIGIN_PROTOCOL,
                Schema.STRING,
                "Route's Origin protocol",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_ORIGIN_TYPE,
                Schema.STRING,
                "Route's Origin type",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_ORIGIN_TYPE,
                Schema.STRING,
                "Route's Origin type",
                Boolean.FALSE,
                Boolean.TRUE));
        break;
      case MAIN:
      default:
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_NEXT_HOP,
                Schema.STRING,
                "Route's Next Hop's Hostname",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_NEXT_HOP,
                Schema.STRING,
                "Route's Next Hop's Hostname",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_NEXT_HOP_IP,
                Schema.IP,
                "Route's Next Hop IP",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_NEXT_HOP_IP,
                Schema.IP,
                "Route's Next Hop IP",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_PROTOCOL,
                Schema.STRING,
                "Route's Protocol",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_PROTOCOL,
                Schema.STRING,
                "Route's Protocol",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_NEXT_HOP_INTERFACE,
                Schema.STRING,
                "Route's Next Hop Interface",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_NEXT_HOP_INTERFACE,
                Schema.STRING,
                "Route's Next Hop Interface",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_METRIC,
                Schema.LONG,
                "Route's Metric",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_METRIC,
                Schema.LONG,
                "Route's Metric",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_BASE_PREFIX + COL_ADMIN_DISTANCE,
                Schema.INTEGER,
                "Route's Admin distance",
                Boolean.FALSE,
                Boolean.TRUE));
        columnBuilder.add(
            new ColumnMetadata(
                COL_DELTA_PREFIX + COL_ADMIN_DISTANCE,
                Schema.INTEGER,
                "Route's Admin distance",
                Boolean.FALSE,
                Boolean.TRUE));
    }
    columnBuilder.add(
        new ColumnMetadata(
            COL_BASE_PREFIX + COL_TAG,
            Schema.LONG,
            "Tag for this route",
            Boolean.FALSE,
            Boolean.TRUE));
    columnBuilder.add(
        new ColumnMetadata(
            COL_DELTA_PREFIX + COL_TAG,
            Schema.LONG,
            "Tag for this route",
            Boolean.FALSE,
            Boolean.TRUE));

    return new TableMetadata(columnBuilder.build(), "Display diff of RIB routes");
  }
