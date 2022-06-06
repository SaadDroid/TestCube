public static <T extends CharSequence> StringProperty<T> createString(String name, Expression expression, Class<T> type) {
        return new StringProperty<>(name, expression, type);
    }
