@VisibleForTesting
  static TableAnswerElement resolveIpSpaceOfLocation(
      SpecifiersQuestion question, SpecifierContext context) {

    List<ColumnMetadata> columns =
        ImmutableList.of(
            new ColumnMetadata(COL_LOCATIONS, Schema.STRING, "Resolution", false, false),
            new ColumnMetadata(COL_IP_SPACE, Schema.STRING, "IP space", false, false));
    TableAnswerElement table = new TableAnswerElement(new TableMetadata(columns));
    Map<String, ColumnMetadata> columnMap = table.getMetadata().toColumnMap();

    Set<Location> locations = question.getLocationSpecifier().resolve(context);
    IpSpaceAssignment ipSpaceAssignment =
        question.getIpSpaceSpecifier().resolve(locations, context);

    for (IpSpaceAssignment.Entry entry : ipSpaceAssignment.getEntries()) {
      table.addRow(
          Row.of(
              columnMap,
              COL_LOCATIONS,
              entry.getLocations().toString(),
              COL_IP_SPACE,
              Objects.toString(entry.getIpSpace())));
    }
    return table;
  }
