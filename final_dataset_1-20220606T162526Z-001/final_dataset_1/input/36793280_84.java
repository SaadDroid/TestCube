public static <T> RetryTransformer<T> of(Retry retry) {
        return new RetryTransformer<>(retry);
    }
