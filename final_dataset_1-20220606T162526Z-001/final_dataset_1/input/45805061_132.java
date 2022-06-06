public GraphModel build(ViewConfig viewConfig, Set<Class<?>> inputTypes) {
    ArgumentChecker.notNull(viewConfig, "viewConfig");
    ArgumentChecker.notNull(inputTypes, "inputTypes");
    ImmutableMap.Builder<String, Map<Class<?>, FunctionModel>> builder = ImmutableMap.builder();
    FunctionModelConfig modelConfig = viewConfig.getDefaultConfig();
    FunctionModelConfig defaultConfig = modelConfig.mergedWith(_defaultConfig, _defaultImplementations);

    for (ViewColumn column : viewConfig.getColumns()) {
      Map<Class<?>, FunctionModel> functions = Maps.newHashMap();

      for (Class<?> inputType : inputTypes) {
        // if we need to support stateful functions this is the place to do it.
        // the FunctionModel could flag if its tree contains any functions annotated as @Stateful and
        // it wouldn't be eligible for sharing with other inputs
        // would need to key on input ID instead of type. would need to assign ID for in-memory trades

        FunctionModel existingFunction = functions.get(inputType);
        OutputName outputName = column.getOutputName(inputType);
        FunctionMetadata function =
            outputName != null ?
                _availableOutputs.getOutputFunction(outputName, inputType) :
                null;

        if (existingFunction == null && function != null) {
          FunctionModelConfig columnConfig = column.getFunctionConfig(inputType);
          FunctionModelConfig config = columnConfig.mergedWith(defaultConfig);
          FunctionModel functionModel =
              FunctionModel.forFunction(function, config, _availableComponents, _nodeDecorator, _argumentConverter);
          functions.put(inputType, functionModel);
          if (s_logger.isDebugEnabled()) {
            s_logger.debug("created function for {}/{}\n{}",
                           column.getName(), inputType.getSimpleName(), functionModel.prettyPrint());
          }
        } else {
          if (outputName != null) {
            s_logger.warn("No function registered that can produce output '{}' for input type {}, column '{}'",
                          outputName.getName(), inputType.getSimpleName(), column.getName());
          } else {
            s_logger.warn("No function registered that can produce output for input type {}, column '{}'",
                          inputType.getSimpleName(), column.getName());
          }
          functions.put(inputType, FunctionModel.forFunction(NoOutputFunction.METADATA));
        }
      }
      builder.put(column.getName(), Collections.unmodifiableMap(functions));
    }
    // build the function models for non-portfolio outputs
    ImmutableMap.Builder<String, FunctionModel> nonPortfolioFunctionModels = ImmutableMap.builder();

    for (NonPortfolioOutput output : viewConfig.getNonPortfolioOutputs()) {
      OutputName outputName = output.getOutput().getOutputName();
      FunctionMetadata function = _availableOutputs.getOutputFunction(outputName);

      if (function != null) {
        FunctionModelConfig functionModelConfig = output.getOutput().getFunctionModelConfig();
        FunctionModelConfig config = functionModelConfig.mergedWith(defaultConfig);
        FunctionModel functionModel =
            FunctionModel.forFunction(function, config, _availableComponents, _nodeDecorator, _argumentConverter);
        nonPortfolioFunctionModels.put(output.getName(), functionModel);
        if (s_logger.isDebugEnabled()) {
          s_logger.debug("created function for {}/{}\n{}", output.getName(), functionModel.prettyPrint());
        }
      } else {
        nonPortfolioFunctionModels.put(output.getName(), FunctionModel.forFunction(NoOutputFunction.METADATA));
        s_logger.warn("Failed to find function to provide output named {}", outputName);
      }
    }
    return new GraphModel(builder.build(), nonPortfolioFunctionModels.build());
  }
