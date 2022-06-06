static void validateJsonPathRegex(String jsonPathRegex) throws BatfishException {
    if (!jsonPathRegex.startsWith("/")) {
      throw new BatfishException(
          String.format(
              "A Batfish %s must start with \"/\"", Variable.Type.JSON_PATH_REGEX.getName()));
    }
    if (!(jsonPathRegex.endsWith("/") || jsonPathRegex.endsWith("/i"))) {
      throw new BatfishException(
          String.format(
              "A Batfish %s must end in either \"/\" or \"/i\"",
              Variable.Type.JSON_PATH_REGEX.getName()));
    }
    String innerPath = "";
    if (jsonPathRegex.lastIndexOf('/') > 0) {
      innerPath = jsonPathRegex.substring(1, jsonPathRegex.lastIndexOf('/'));
    }
    try {
      Pattern.compile(innerPath);
    } catch (PatternSyntaxException e) {
      throw new BatfishException(
          String.format(
              "Invalid %s at interior of %s",
              Variable.Type.JAVA_REGEX.getName(), Variable.Type.JSON_PATH_REGEX.getName()),
          e);
    }
  }
