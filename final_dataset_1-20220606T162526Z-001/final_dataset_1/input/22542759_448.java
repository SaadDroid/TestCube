@VisibleForTesting
  static Map<String, String> evaluateMacros(SecureStore secureStore, String user, String namespace,
                                            Map<String, String> properties) {
    // evaluate macros in the provisioner properties
    MacroEvaluator evaluator = new ProvisionerMacroEvaluator(namespace, secureStore);
    MacroParser macroParser = new MacroParser(evaluator,
                                              MacroParserOptions.builder()
                                                .disableLookups()
                                                .setFunctionWhitelist(ProvisionerMacroEvaluator.SECURE_FUNCTION)
                                                .setEscaping(false)
                                                .build());
    Map<String, String> evaluated = new HashMap<>();

    // do secure store lookups as the user that will run the program
    String oldUser = SecurityRequestContext.getUserId();
    try {
      SecurityRequestContext.setUserId(user);
      for (Map.Entry<String, String> property : properties.entrySet()) {
        String key = property.getKey();
        String val = property.getValue();
        evaluated.put(key, macroParser.parse(val));
      }
    } finally {
      SecurityRequestContext.setUserId(oldUser);
    }
    return evaluated;
  }
