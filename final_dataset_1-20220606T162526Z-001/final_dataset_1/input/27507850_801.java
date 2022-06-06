@SuppressWarnings({"rawtypes", "unchecked"})
  @VisibleForTesting
  @Nonnull
  Comparator<Row> columnComparator(ColumnMetadata columnMetadata) {
    Schema schema = columnMetadata.getSchema();
    Comparator schemaComparator = schemaComparator(schema);
    Comparator comparator =
        comparing((Row r) -> r.get(columnMetadata.getName(), schema), nullsFirst(schemaComparator));
    return comparator;
  }
