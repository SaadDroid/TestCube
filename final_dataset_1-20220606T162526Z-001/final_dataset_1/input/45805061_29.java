public ScenarioDataBuilder addSecurityValue(String scenarioId, Security security, FieldName fieldName, double value) {
    builder(scenarioId).add(SecurityId.of(security, Double.class, fieldName), value);
    return this;
  }
