public static List<String> getParameterAsStringList(
      final Map<String, List<String>> parameterMap, final String key)
      throws IllegalArgumentException {
    final String list = String.join(",", validateQueryParameter(parameterMap, key));
    return splitter.splitToStream(list).distinct().map(String::trim).collect(Collectors.toList());
  }
