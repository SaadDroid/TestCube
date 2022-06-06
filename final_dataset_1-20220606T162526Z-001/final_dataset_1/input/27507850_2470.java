static Question validateTemplate(JSONObject questionJson, Map<String, JsonNode> parsedParameters)
      throws JSONException, IOException {

    JSONObject instanceJson = questionJson.getJSONObject(BfConsts.PROP_INSTANCE);
    InstanceData instanceData =
        BatfishObjectMapper.mapper()
            .readValue(instanceJson.toString(), new TypeReference<InstanceData>() {});
    Map<String, Variable> variables = instanceData.getVariables();

    /*
     * We want all variables to be exercised (i.e, assigned values) as part of validation because
     * unexercised parameters and variables are removed as part of template preprocessing in {@link
     * Question#preprocessQuestion(String)} and then we cannot know if the parameter programmed in
     * the template belonged to that of the class.
     */
    Sets.SetView<String> extraVariables =
        Sets.difference(variables.keySet(), parsedParameters.keySet());
    if (!extraVariables.isEmpty()) {
      throw new BatfishException(
          "Template validation should exercise all variables. Un-exercised variables: "
              + extraVariables);
    }

    String questionStr = questionJson.toString();
    for (String variable : variables.keySet()) {
      if (!questionStr.contains("${" + variable + "}")) {
        throw new BatfishException("Unused variable: " + variable);
      }
    }

    return Question.parseQuestion(fillTemplate(questionJson, parsedParameters, "qname").toString());
  }
