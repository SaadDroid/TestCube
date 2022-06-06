public static <T> TypeLiteral<T> of(Class<T> type) {
        return new TypeLiteral<>(type);
    }
