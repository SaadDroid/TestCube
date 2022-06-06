public static <K, V extends Persistent> MapProperty<K, V> createMap(String name, Expression expression, Class<K> keyType, Class<V> entityType) {
        return new MapProperty<>(name, expression, keyType, entityType);
    }
