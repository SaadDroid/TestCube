public Schema build(Collection<Class<?>> messageTypes) throws IllegalArgumentException {
        return addMessages(messageTypes).build();
    }
