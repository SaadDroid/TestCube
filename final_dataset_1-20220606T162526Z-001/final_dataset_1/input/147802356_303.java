public static String validateQueryParameter(
      final Map<String, List<String>> parameterMap, final String key)
      throws IllegalArgumentException {
    if (parameterMap.containsKey(key)) {
      if (parameterMap.get(key).size() != 1) {
        throw new IllegalArgumentException(String.format(MUST_SPECIFY_ONLY_ONCE, key));
      }
      if (!StringUtils.isEmpty(parameterMap.get(key).get(0))) {
        return parameterMap.get(key).get(0);
      }
    }
    throw new IllegalArgumentException(String.format(NULL_OR_EMPTY_FORMAT, key));
  }
