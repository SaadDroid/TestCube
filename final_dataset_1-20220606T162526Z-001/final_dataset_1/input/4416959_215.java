public ApplicationStatePersistenceStrategy get(String name)
    {
        ApplicationStatePersistenceStrategy result = configuration.get(name);

        if (result == null)
            throw new RuntimeException(String.format("No application state persistence strategy is available with name '%s'. Available strategies: %s.", name, InternalUtils
                    .joinSorted(configuration.keySet())));

        return result;
    }
