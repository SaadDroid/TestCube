public Object parseClient(String clientValue, ComponentResources componentResources,
                              FieldTranslator<Object> translator, NullFieldStrategy nullFieldStrategy) throws ValidationException
    {
        assert componentResources != null;
        assert translator != null;
        assert nullFieldStrategy != null;
        String effectiveValue = clientValue;

        if (InternalUtils.isBlank(effectiveValue))
        {
            effectiveValue = nullFieldStrategy.replaceFromClient();

            if (effectiveValue == null)
                return null;
        }

        final Holder<Object> resultHolder = Holder.create();

        ComponentEventCallback callback = new ComponentEventCallback()
        {
            public boolean handleResult(Object result)
            {
                resultHolder.put(result);
                return true;
            }
        };

        try
        {
            componentResources.triggerEvent(EventConstants.PARSE_CLIENT, new Object[]
                    {effectiveValue}, callback);
        } catch (RuntimeException ex)
        {
            rethrowValidationException(ex);
        }

        if (resultHolder.hasValue())
            return resultHolder.get();

        return translator.parse(effectiveValue);
    }
