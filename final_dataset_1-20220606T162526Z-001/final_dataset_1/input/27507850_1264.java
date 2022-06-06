public static <T> void fillProperty(
      PropertyDescriptor<T> propertyDescriptor, T object, String columnName, RowBuilder row) {
    checkArgument(propertyDescriptor != null, "'propertyDescriptor' cannot be null");
    checkArgument(object != null, "'object' cannot be null");
    checkArgument(columnName != null, "'columnName' cannot be null");
    checkArgument(row != null, "'row' cannot be null");

    Object propertyValue = propertyDescriptor.getGetter().apply(object);
    propertyValue =
        PropertySpecifier.convertTypeIfNeeded(propertyValue, propertyDescriptor.getSchema());
    fillProperty(columnName, propertyValue, row, propertyDescriptor); // separate for testing
  }
