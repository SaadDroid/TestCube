static void validateAndSet(Map<String, JsonNode> parameters, Map<String, Variable> variables)
      throws BatfishException {
    for (Entry<String, JsonNode> e : parameters.entrySet()) {
      String parameterName = e.getKey();
      JsonNode value = e.getValue();
      Variable variable = variables.get(parameterName);
      if (variable == null) {
        throw new BatfishException(
            "No variable named: '" + parameterName + "' in supplied question template");
      }
      if (variable.getMinElements() != null) {
        // Value is an array, check size and validate each elements in it
        if (!value.isArray() || value.size() < variable.getMinElements()) {
          throw new BatfishException(
              String.format(
                  "Invalid value for parameter %s: %s. "
                      + "Expecting a JSON array of at least %d "
                      + "elements",
                  parameterName, value, variable.getMinElements()));
        }
        for (JsonNode node : value) {
          validateNode(node, variable, parameterName);
        }
      } else {
        validateNode(value, variable, parameterName);
      }
      // validation passed.
      variable.setValue(value);
    }
  }
