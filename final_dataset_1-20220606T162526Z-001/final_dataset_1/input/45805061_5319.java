public FunctionConfigurationBundle aggregate(final String configDefinitionName, final VersionCorrection version) {
    ArgumentChecker.notNull(configDefinitionName, "configDefinitionName");
    FunctionConfigurationDefinition configDefinition = _configSource.getSingle(FunctionConfigurationDefinition.class, configDefinitionName, version);
    FunctionConfigurationBundle bundle = new FunctionConfigurationBundle();
    if (configDefinition != null) {
      bundle = functionAggregator(configDefinition, version);
    }
    return bundle;
  }
