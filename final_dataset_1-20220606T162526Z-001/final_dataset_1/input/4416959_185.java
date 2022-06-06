public NullFieldStrategy get(String name)
    {
        NullFieldStrategy result = configuration.get(name);

        if (result != null) return result;
        
        throw new UnknownValueException(String.format("Unrecognized name '%s' locating a null field strategy.", name),
                new AvailableValues("Configured null field strategies", configuration));

    }
