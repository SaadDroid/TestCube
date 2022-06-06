static void validateNode(JsonNode value, Variable variable, String parameterName)
      throws BatfishException {
    try {
      validateType(value, variable);
    } catch (BatfishException e) {
      String errorMessage =
          String.format("Invalid value for parameter %s: %s", parameterName, value);
      throw new BatfishException(errorMessage, e);
    }
    if (!variable.getValues().isEmpty()
        && variable.getValues().stream()
            .noneMatch(allowedValue -> allowedValue.getName().equals(value.asText()))) {
      throw new BatfishException(
          String.format(
              "Invalid value: %s, allowed values are: %s", value.asText(), variable.getValues()));
    }
  }
