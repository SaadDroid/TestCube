public static Options getCommandLineOptions() {
        Options options = new Options();
        // Properties
        options.addOption(Option.builder(D_OPT)
                .numberOfArgs(2)
                .argName("property=value")
                .valueSeparator()
                .desc("use value for given property")
                .build());
        // Classpath
        options.addOption(Option.builder(PROJECT_CP_OPT)
                .hasArg()
                .desc("classpath of the project under test and all its dependencies")
                .build());
        // Target frame
        options.addOption(Option.builder(TARGET_FRAME_OPT)
                .hasArg()
                .desc("Level of the target frame")
                .build());
        // Stack trace file
        options.addOption(Option.builder(CRASH_LOG_OPT)
                .hasArg()
                .desc("File with the stack trace")
                .build());
        // Models directory
        options.addOption(Option.builder(MODEL_PATH_OPT)
                .hasArg()
                .desc("Directory of models generated by Botsing model generator")
                .build());
        // Search Algorithm
        options.addOption(Option.builder(SEARCH_ALGORITHM)
                .hasArg()
                .desc("Select the search algorithm.")
                .build());

        // FitnessFunction
        options.addOption(Option.builder(FITNESS_FUNCTION)
                .hasArg()
                .desc("Fitness function for guidance of the search algorithm")
                .build());

        // Use integration testing or not
        options.addOption(Option.builder(INTEGRATION_TESTING)
                .desc("Use integration testing for crash reproduction")
                .build());

        // Help message
        options.addOption(Option.builder(HELP_OPT)
                .desc("Prints this help message.")
                .build());

        // enable I/O diversity
        options.addOption(Option.builder(IO_DIVERSITY)
                .desc("Enables I/O diversity")
                .build());

        return options;
    }