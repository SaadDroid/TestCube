public static ScenarioDefinition ofMappings(List<? extends PerturbationMapping<?>> mappings) {
    ArgumentChecker.notEmpty(mappings, "mappings");
    int numScenarios = countScenarios(mappings, false);

    for (int i = 1; i < mappings.size(); i++) {
      if (mappings.get(i).getPerturbations().size() != numScenarios) {
        throw new IllegalArgumentException(
            "All mappings must have the same number of perturbations. First mapping" +
                " has " + numScenarios + " perturbations, mapping " + i + " has " +
                mappings.get(i).getPerturbations().size());
      }
    }
    ImmutableSet<String> scenarioNames = generateNames(numScenarios);
    return new ScenarioDefinition(createScenarios(scenarioNames, mappings, false));
  }
