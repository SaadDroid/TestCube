@SuppressWarnings("unchecked")
    public Object coerceContext(int index, String desiredTypeName)
    {
        if (index >= context.getCount())
            throw new IllegalArgumentException(String.format("Method %s has more parameters than there are context values for this component event.", getMethodDescription()));
        try
        {
            Class desiredType = elementResources.toClass(desiredTypeName);

            return context.get(desiredType, index);
        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException(String.format("Exception in method %s, parameter #%d: %s", getMethodDescription(), index + 1, ex), ex);
        }
    }
