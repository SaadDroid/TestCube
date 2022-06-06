@SuppressWarnings("unchecked")
    public <T> T get(@Nonnull String name, @Nonnull Class<T> type) {
        if (name == null) {
            throw new IllegalArgumentException("Method argument name must not be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Method argument type must not be null.");
        }

        if (type.isEnum()) {
            return getEnumInstance(name, (Class<Enum>) type);
        }

        if (type.isArray() && type.getComponentType().isEnum()) {
            return getEnumInstanceArray(name, type);
        }

        final Class<?> boxedType = primitiveToWrapper(type);
        return (T) this.map.get(name, boxedType);
    }
