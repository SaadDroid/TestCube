public static int getParameterValueAsInt(
      final Map<String, List<String>> parameterMap, final String key)
      throws IllegalArgumentException {
    String stringValue = validateQueryParameter(parameterMap, key);
    try {
      return Integer.parseInt(stringValue);
    } catch (IllegalArgumentException ex) {
      throw new IllegalArgumentException(INVALID_NUMERIC_VALUE);
    }
  }
