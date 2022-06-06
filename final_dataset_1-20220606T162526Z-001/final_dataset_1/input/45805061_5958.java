@FromString
  public static ObjectId parse(String str) {
    ArgumentChecker.notEmpty(str, "str");
    if (str.contains("~") == false) {
      str = StringUtils.replace(str, "::", "~");  // leniently parse old data
    }
    String[] split = StringUtils.splitByWholeSeparatorPreserveAllTokens(str, "~");
    switch (split.length) {
      case 2:
        return ObjectId.of(split[0], split[1]);
    }
    throw new IllegalArgumentException("Invalid identifier format: " + str);
  }
