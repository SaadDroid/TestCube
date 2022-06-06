public static <T extends GenericContainer> Verifiable<T> with(
            T data,
            Schema originalSchema,
            Verifier<T> verifier) {
        return new Verifiable<>(data, originalSchema, verifier);
    }
