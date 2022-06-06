public List<TestGenerationResult> parseCommandLine(String[] args) {
        // Get default properties
        CrashProperties crashProperties = CrashProperties.getInstance();

        // Parse commands according to the defined options
        Options options = CommandLineParameters.getCommandLineOptions();
        CommandLine commands = parseCommands(args, options, false);

        // If help option is provided
        if (commands.hasOption(HELP_OPT)) {
            printHelpMessage(options, false);
        } else if(!(commands.hasOption(PROJECT_CP_OPT) && commands.hasOption(CRASH_LOG_OPT) && commands.hasOption(TARGET_FRAME_OPT))) { // Check the required options are there
            LOG.error("A mandatory option -{} -{} -{} is missing!", PROJECT_CP_OPT, CRASH_LOG_OPT, TARGET_FRAME_OPT);
            printHelpMessage(options, false);
        } else {// Otherwise, proceed to crash reproduction

            // Update EvoSuite's properties
            java.util.Properties properties = commands.getOptionProperties(D_OPT);
            updateEvoSuiteProperties(properties);
            // Setup project class paths
            crashProperties.setClasspath(getCompatibleCP(commands.getOptionValue(PROJECT_CP_OPT)));
            setupProjectClasspath(crashProperties.getProjectClassPaths());
            // Setup stack trace(s)
            setupStackTrace(crashProperties, commands);
            // Set the search algorithm
            if(commands.hasOption(SEARCH_ALGORITHM)){
                setSearchAlgorithm(commands.getOptionValue(SEARCH_ALGORITHM));
            }
            // Set fitness function(s)
            if(commands.hasOption(FITNESS_FUNCTION)){
                setFF(commands.getOptionValue(FITNESS_FUNCTION));
            }
            // Enable integration testing in the crash reproduction process if it is necessary.
            if(commands.hasOption(INTEGRATION_TESTING)){
                CrashProperties.integrationTesting = true;
            }
            // Estimating the missing lines in the stack trace
            if(commands.hasOption(DISABLE_LINE_ESTIMATION)){
                CrashProperties.lineEstimation = false;
            }
            // Add I/O Diversity as goals to MOSA
            if(commands.hasOption(IO_DIVERSITY)){
                CrashProperties.IODiversity = true;
            }
            // Use model seeding
            if(commands.hasOption(MODEL_PATH_OPT)){
                setupModelSeedingRelatedProperties(commands);
            }
            // execute
            return CrashReproduction.execute();
        }
        return null;

    }
