public Translator get(String name)
    {
        Translator result = nameToTranslator.get(name);

        if (result == null)
            throw new UnknownValueException(String.format("Unknown translator type '%s'.", name), new AvailableValues(
                    "Configured translators", nameToTranslator));

        return result;
    }
