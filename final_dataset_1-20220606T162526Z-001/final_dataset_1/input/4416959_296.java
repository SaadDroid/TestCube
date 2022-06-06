public String toClient(Object value, ComponentResources componentResources, FieldTranslator<Object> translator,
                           NullFieldStrategy nullFieldStrategy)
    {
        assert componentResources != null;
        assert translator != null;
        assert nullFieldStrategy != null;
        final Holder<String> resultHolder = Holder.create();

        ComponentEventCallback callback = new ComponentEventCallback()
        {
            public boolean handleResult(Object result)
            {
                // What's nice is that the ComponentEventException will automatically identify
                // the method description.

                if (!(result instanceof String))
                    throw new RuntimeException("Return value from 'parseClient' event handler method must be a string.");

                resultHolder.put((String) result);

                return true;
            }
        };

        componentResources.triggerEvent(EventConstants.TO_CLIENT, new Object[]
                {value}, callback);

        if (resultHolder.hasValue())
            return resultHolder.get();

        Object effectiveValue = value;

        if (effectiveValue == null)
        {
            effectiveValue = nullFieldStrategy.replaceToClient();

            // Don't try to coerce or translate null.

            if (effectiveValue == null)
                return null;
        }

        // And now, whether its a value from a bound property, or from the null field strategy,
        // get it into the right format for the translator and let it translate.

        Object coerced = typeCoercer.coerce(effectiveValue, translator.getType());

        return translator.toClient(coerced);
    }
