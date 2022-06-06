public CommandDocument parseArguments(String args) throws BadUsageException, IOException {
        return parseArguments(getArgsFromString(args));
    }
