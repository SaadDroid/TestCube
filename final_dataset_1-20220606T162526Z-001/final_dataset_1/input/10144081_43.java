void populateField(final Object target, final Field field, final RandomizationContext context) throws IllegalAccessException {
        Randomizer<?> randomizer = getRandomizer(field, context);
        if (randomizer instanceof SkipRandomizer) {
            return;
        }
        if (randomizer instanceof ContextAwareRandomizer) {
            ((ContextAwareRandomizer<?>) randomizer).setRandomizerContext(context);
        }
        context.pushStackItem(new RandomizationContextStackItem(target, field));
        if(!context.hasExceededRandomizationDepth()) {
            Object value;
            if (randomizer != null) {
                value = randomizer.getRandomValue();
            } else {
                try {
                    value = generateRandomValue(field, context);
                } catch (ObjectCreationException e) {
                    String exceptionMessage = String.format("Unable to create type: %s for field: %s of class: %s",
                          field.getType().getName(), field.getName(), target.getClass().getName());
                    // FIXME catch ObjectCreationException and throw ObjectCreationException ?
                    throw new ObjectCreationException(exceptionMessage, e);
                }
            }
            if (context.getParameters().isBypassSetters()) {
                setFieldValue(target, field, value);
            } else {
                try {
                    setProperty(target, field, value);
                } catch (InvocationTargetException e) {
                    String exceptionMessage = String.format("Unable to invoke setter for field %s of class %s",
                            field.getName(), target.getClass().getName());
                    throw new ObjectCreationException(exceptionMessage,  e.getCause());
                }
            }
        }
        context.popStackItem();
    }
