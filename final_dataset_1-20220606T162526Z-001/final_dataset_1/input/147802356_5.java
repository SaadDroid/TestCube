public int parse(final String[] args) {
    // first pass to obtain config file if specified and print usage/version help
    final ConfigFileCommand configFileCommand = new ConfigFileCommand();
    final CommandLine configFileCommandLine = getConfigFileCommandLine(configFileCommand);
    configFileCommandLine.parseArgs(args);
    if (configFileCommandLine.isUsageHelpRequested()) {
      return executeCommandUsageHelp();
    } else if (configFileCommandLine.isVersionHelpRequested()) {
      return executeCommandVersion();
    }

    final Optional<File> configFile = getConfigFileFromCliOrEnv(configFileCommand);

    // final pass
    final CommandLine commandLine = getCommandLine();
    commandLine.setCaseInsensitiveEnumValuesAllowed(true);
    commandLine.setOut(outputWriter);
    commandLine.setErr(errorWriter);
    commandLine.setParameterExceptionHandler(this::handleParseException);
    commandLine.setDefaultValueProvider(defaultValueProvider(commandLine, configFile));

    return commandLine.execute(args);
  }
