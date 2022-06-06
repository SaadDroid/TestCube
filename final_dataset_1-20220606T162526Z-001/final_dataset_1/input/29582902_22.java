public static String removeEachParameter(String param, String query) {
    String result = QueryUtil.removeParameter(param, query);
    while (!result.equals(query)) {
      query = result;
      result = QueryUtil.removeParameter(param, query);
    }
    return result;
  }
