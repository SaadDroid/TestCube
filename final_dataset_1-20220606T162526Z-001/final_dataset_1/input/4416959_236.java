public Translator getByType(Class valueType)
    {
        Translator result = registry.get(valueType);

        if (result == null)
        {
            List<String> names = CollectionFactory.newList();

            for (Class type : registry.getTypes())
            {
                names.add(type.getName());
            }

            throw new IllegalArgumentException(String.format("No translator is defined for type %s.  Registered types: %s.", PlasticUtils.toTypeName(valueType), InternalUtils
                    .joinSorted(names)));
        }

        return result;
    }
