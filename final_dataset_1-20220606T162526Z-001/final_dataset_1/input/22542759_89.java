public static List<String> init(Object object, String[] args, String appName, String appVersion, PrintStream out) {
    List<String> nonOptionArgs = new ArrayList<>();
    Map<String, String> parsedOptions = parseArgs(args, nonOptionArgs);
    Map<String, OptionSpec> declaredOptions = extractDeclarations(object);

    if (parsedOptions.containsKey("help") && !declaredOptions.containsKey("help")) {
      printUsage(declaredOptions, appName, appVersion, out);
      return Collections.emptyList();
    }

    for (String name : parsedOptions.keySet()) {
      if (declaredOptions.containsKey(name)) {
        continue;
      }
      throw new UnrecognizedOptionException(name);
    }

    for (Map.Entry<String, String> option : parsedOptions.entrySet()) {
      try {
        declaredOptions.get(option.getKey()).setValue(option.getValue());
      } catch (IllegalAccessException e) {
        throw new IllegalAccessError(e.getMessage());
      }
    }

    for (Map.Entry<String, OptionSpec> declOption : declaredOptions.entrySet()) {
      OptionSpec option = declOption.getValue();
      if (option.getEnvVar().length() > 0 && !parsedOptions.containsKey(option.getName())) {
        String envVal = System.getenv(option.getEnvVar());
        if (null != envVal) {
          try {
            option.setValue(envVal);
          } catch (IllegalAccessException e) {
            throw new IllegalAccessError(e.getMessage());
          }
        }
      }
    }
    return nonOptionArgs;
  }
