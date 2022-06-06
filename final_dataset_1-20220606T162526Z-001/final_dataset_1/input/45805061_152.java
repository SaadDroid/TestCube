public Map<String, Object> getConfigPageModel(String columnName,
                                                FunctionModelConfig config,
                                                @Nullable Class<?> inputType,
                                                @Nullable OutputName outputName,
                                                @Nullable FunctionModel model) {
    ArgumentChecker.notEmpty(columnName, "columnName");
    List<Map<String, Object>> inputTypeList = new ArrayList<>();

    // TODO if we're editing an existing config this should either be empty or only contain the selected type
    // the user shouldn't be able to change the input type for an existing config, that's part of the key
    // TODO if we're adding a new config the types shouldn't include the types for which the column already has config
    for (Class<?> type : _availableOutputs.getInputTypes()) {
      inputTypeList.add(typeMap(type));
    }
    Collections.sort(inputTypeList, TypeMapComparator.INSTANCE);

    Map<String, Object> jsonMap = new HashMap<>();
    jsonMap.put(COL_NAME, columnName);
    jsonMap.put(INPUT_TYPES, inputTypeList);

    if (inputType != null) {
      Set<OutputName> availableOutputs = _availableOutputs.getAvailableOutputs(inputType);
      List<String> outputNames = new ArrayList<>(availableOutputs.size());

      for (OutputName availableOutput : availableOutputs) {
        outputNames.add(availableOutput.getName());
      }
      Collections.sort(outputNames);
      // TODO output names needs to be filtered so it only includes names for which no config exists
      // need the existing ViewColumn
      jsonMap.put(INPUT_TYPE, typeMap(inputType));
      jsonMap.put(OUTPUT_NAMES, outputNames);

      if (outputName != null && availableOutputs.contains(outputName)) {
        jsonMap.put(OUTPUT_NAME, outputName.getName());
      }
    }
    List<Map<String, Object>> functions = getFunctions(config, model);

    if (!functions.isEmpty()) {
      jsonMap.put(FUNCTIONS, functions);
    }
    return jsonMap;
  }
