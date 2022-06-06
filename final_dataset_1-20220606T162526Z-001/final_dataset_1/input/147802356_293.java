public static List<Integer> getParameterAsIntegerList(
      final Map<String, List<String>> parameterMap, final String key)
      throws IllegalArgumentException {
    String integerList = "";
    try {
      integerList = String.join(",", validateQueryParameter(parameterMap, key));
      return splitter
          .splitToStream(integerList)
          .map(Integer::parseUnsignedInt)
          .collect(Collectors.toList());
    } catch (NumberFormatException ex) {
      throw new IllegalArgumentException(
          String.format("Failed to parse query parameter (%s:%s) to Integers", key, integerList),
          ex);
    }
  }
