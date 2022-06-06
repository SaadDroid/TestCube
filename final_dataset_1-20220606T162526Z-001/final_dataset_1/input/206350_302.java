@SuppressWarnings("unchecked")
    @Override
    public ExtendedType<? extends ValueObjectType> getType(Class<?> objectClass) {

        ValueObjectType<?, ?> valueObjectType = valueObjectTypeRegistry.getValueType(objectClass);
        if(valueObjectType == null) {
            return null;
        }
        ExtendedType<?> decorator = map.getExplictlyRegisteredType(valueObjectType.getTargetType().getCanonicalName());

        return new ExtendedTypeConverter(decorator, valueObjectType);
    }
