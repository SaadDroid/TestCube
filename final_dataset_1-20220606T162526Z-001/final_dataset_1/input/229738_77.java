@SuppressWarnings("unchecked")
    static RowMapperFactory factory() {
        return (type, config) -> {
            if (type instanceof ParameterizedType && getErasedType(type).equals(Map.Entry.class)) {
                Type keyType = resolveType(KEY_PARAM, type);
                Type valueType = resolveType(VALUE_PARAM, type);

                RowMapper<?> keyMapper = getKeyMapper(keyType, config);
                RowMapper<?> valueMapper = getValueMapper(valueType, config);

                return Optional.of(new MapEntryMapper(keyMapper, valueMapper));
            }
            return Optional.empty();
        };
    }
