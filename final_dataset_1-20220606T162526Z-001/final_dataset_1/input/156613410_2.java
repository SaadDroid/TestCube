static String extractSet(String rawType) {
    String setType = rawType.substring(14, rawType.length() - 1);
    if (setType.startsWith("? extends")) {
      return setType.substring(10);
    }
    return setType;
  }
