static String extractForwardedFor(String forwarded) {
    int start = forwarded.toLowerCase().indexOf("for=");
    if (start < 0) {
      return null;
    }
    start += 4; // start is now the index after for=
    if (start >= forwarded.length() - 1) { // the value after for= must not be empty
      return null;
    }
    for (int i = start; i < forwarded.length() - 1; i++) {
      char c = forwarded.charAt(i);
      if (c == ',' || c == ';') {
        if (i == start) { // empty string
          return null;
        }
        return forwarded.substring(start, i);
      }
    }
    return forwarded.substring(start);
  }
