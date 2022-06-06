public <T> T findMeta(String key, final ComponentResources resources, Class<T> expectedType)
    {
        String value = getSymbolExpandedValueFromCache(key, resources.getCompleteId() + "/" + key,
                new ValueLocator()
                {
                    public String valueForKey(String key)
                    {
                        return locate(key, resources);
                    }
                });

        return typeCoercer.coerce(value, expectedType);
    }
