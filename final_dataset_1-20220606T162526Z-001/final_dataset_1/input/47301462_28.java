public static TypedValue ofLocal(ColumnMetaData.Rep rep, Object value) {
    return new TypedValue(rep, localToSerial(rep, value));
  }
