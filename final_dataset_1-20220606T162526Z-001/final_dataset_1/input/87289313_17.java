public static <T> CloseableIterable<T> limit(final Iterable<T> iterable, final int start, final Integer end, final boolean truncate) {
        return new LimitedIterable<>(iterable, start, end, truncate);
    }
