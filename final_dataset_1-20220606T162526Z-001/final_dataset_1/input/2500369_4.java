@Override
    public void parseArguments(final ParsedArguments parsedArguments, final String... arguments) throws ArgumentValidationException
    {
        boolean finishedOptions = false;
        for (final String argument : arguments)
        {
           if(finishedOptions)
           {
               parsedArguments.addValue(argument);
           }
           else
           {
               finishedOptions = add(parsedArguments, argument);
           }
        }
    }
