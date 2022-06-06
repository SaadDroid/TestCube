public static <T> MinijaxCriteriaQuery<T> parse(final MinijaxCriteriaBuilder cb, final Class<T> resultType, final List<Token> tokens) {
        return new Parser<>(cb, resultType, tokens).parse();
    }
