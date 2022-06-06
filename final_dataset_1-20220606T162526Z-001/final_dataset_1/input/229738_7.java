@Override
    public Optional<Argument> build(Type type, Object value, ConfigRegistry config) {
        Class<?> rawType = GenericTypes.getErasedType(type);

        if (VALUE_CLASSES.stream().anyMatch(vc -> vc.isAssignableFrom(rawType))) {
            return buildValueArgument(type, config, (Value) value);
        }

        return Optional.empty();
    }
