public static String removeParameter(String param, String query) {
    String token = param + "=";
    int i = query.indexOf(token);
    while (i > 0 && query.charAt(i - 1) != '&') {
      i = query.indexOf(token, i + 1);
    }
    if (i == -1) return query;    
    int j = query.indexOf('&', i);
    if (j == -1) {
      return query.substring(0, i == 0 ? i : i - 1);
    }
    return query.substring(0, i) + query.substring(j + 1);
  }
