public static String findParameter(String param, String query) {
    String token = param + "=";
    int i = query.indexOf(token);
    if (i == -1) return null;
    
    while (i > 0 && query.charAt(i - 1) != '&') {
      i = query.indexOf(token, i + 1);
    }
    if (i == -1) return null;
    
    int j = query.indexOf('&', i);
    if (j == -1) {
      j = query.length();
    }
    
    return query.substring(query.indexOf('=', i) + 1, j);
  }
