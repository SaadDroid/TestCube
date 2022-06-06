@VisibleForTesting
  @Nonnull
  TableAnswerElement processAnswerTable(TableAnswerElement rawTable, AnswerRowsOptions options) {
    Map<String, ColumnMetadata> rawColumnMap = rawTable.getMetadata().toColumnMap();
    List<Row> filteredRows =
        rawTable.getRowsList().stream()
            .filter(row -> options.getFilters().stream().allMatch(filter -> filter.matches(row)))
            .collect(ImmutableList.toImmutableList());

    Stream<Row> rowStream = filteredRows.stream();
    if (!options.getSortOrder().isEmpty()) {
      // sort using specified sort order
      rowStream = rowStream.sorted(buildComparator(rawColumnMap, options.getSortOrder()));
    }
    TableAnswerElement table;
    if (options.getColumns().isEmpty()) {
      table = new TableAnswerElement(rawTable.getMetadata());
    } else {
      // project to desired columns
      rowStream =
          rowStream.map(rawRow -> Row.builder().putAll(rawRow, options.getColumns()).build());
      Map<String, ColumnMetadata> columnMap = new LinkedHashMap<>(rawColumnMap);
      columnMap.keySet().retainAll(options.getColumns());
      List<ColumnMetadata> columnMetadata =
          columnMap.values().stream().collect(ImmutableList.toImmutableList());
      table =
          new TableAnswerElement(
              new TableMetadata(columnMetadata, rawTable.getMetadata().getTextDesc()));
    }
    if (options.getUniqueRows()) {
      // uniquify if desired
      rowStream = rowStream.distinct();
    }
    // offset, truncate, and add to table
    rowStream.skip(options.getRowOffset()).limit(options.getMaxRows()).forEach(table::addRow);
    table.setSummary(rawTable.getSummary() != null ? rawTable.getSummary() : new AnswerSummary());
    table.getSummary().setNumResults(filteredRows.size());
    return table;
  }
