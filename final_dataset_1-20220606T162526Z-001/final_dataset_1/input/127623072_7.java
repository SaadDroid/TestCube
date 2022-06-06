static <T> TypeLiteral<T> normalize(TypeLiteral<T> type) {
        Objects.requireNonNull(type, "Null type");
        if(type.getClass() == TypeLiteral.class) {
            // direct instance, pass through
            return type;
        }
        // just recreate it with same content
        return new TypeLiteral<>(type.getRawType(), type.argumentTypes);
    }
