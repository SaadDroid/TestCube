public static ValueProperties.Builder removeAll(final ValueProperties originalProperties, final String... propertiesToRemove) {
    ArgumentChecker.notNull(originalProperties, "original properties");
    final ValueProperties.Builder newProperties = originalProperties.copy();
    if (propertiesToRemove == null || propertiesToRemove.length == 0) {
      return newProperties;
    }
    for (final String propertyName : propertiesToRemove) {
      newProperties.withoutAny(propertyName);
    }
    return newProperties;
  }
