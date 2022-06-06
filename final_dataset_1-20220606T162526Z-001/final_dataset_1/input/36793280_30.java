public static <T> RetryOperator<T> of(Retry retry) {
        return new RetryOperator<>(retry);
    }
