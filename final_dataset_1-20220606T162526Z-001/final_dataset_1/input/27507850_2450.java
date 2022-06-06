static void validateJsonPath(JsonNode jsonPath) throws BatfishException {
    if (!jsonPath.isContainerNode()) {
      throw new BatfishException(
          String.format(
              "Expecting a JSON dictionary for a Batfish %s", Variable.Type.JSON_PATH.getName()));
    }
    if (jsonPath.get("path") == null) {
      throw new BatfishException(
          String.format("Missing 'path' element of %s", Variable.Type.JSON_PATH.getName()));
    }
    if (!jsonPath.get("path").isTextual()) {
      throw new BatfishException(
          String.format(
              "'path' element of %s must be a JSON string", Variable.Type.JSON_PATH.getName()));
    }
    if (jsonPath.get("suffix") != null && !jsonPath.get("suffix").isBoolean()) {
      throw new BatfishException(
          String.format(
              "'suffix' element of %s must be a JSON boolean", Variable.Type.JSON_PATH.getName()));
    }
  }
