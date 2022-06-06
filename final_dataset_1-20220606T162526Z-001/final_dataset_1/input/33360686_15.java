public String extractEntityTypeName(final EdmNavigationProperty enp, final Class<?> fallbackClass) {
    Class<?> entityTypeClass = enp.toType();
    return extractEntityTypeName(entityTypeClass == Object.class ? fallbackClass : entityTypeClass);
  }
