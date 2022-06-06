@VisibleForTesting
  @Nullable
  static Integer computeColumnMax(
      @Nonnull TableAnswerElement table, @Nonnull String column, @Nonnull BatfishLogger logger) {
    ColumnMetadata columnMetadata = table.getMetadata().toColumnMap().get(column);
    if (columnMetadata == null) {
      String message = String.format("No column named: %s", column);
      logger.errorf("%s\n", message);
      throw new IllegalArgumentException(message);
    }
    Schema schema = columnMetadata.getSchema();
    Function<Row, Integer> rowToInteger;
    if (schema.equals(Schema.INTEGER)) {
      rowToInteger = r -> r.getInteger(column);
    } else if (schema.equals(Schema.ISSUE)) {
      rowToInteger = r -> r.getIssue(column).getSeverity();
    } else {
      // unsupported
      return null;
    }
    return table.getRows().getData().stream()
        .map(rowToInteger)
        .filter(Objects::nonNull)
        .max(Comparator.naturalOrder())
        .orElse(null);
  }
