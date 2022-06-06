public static <T> Iterable<List<T>> groupBy(final Iterable<? extends T> iterable, final Function<? super T, ?> groupingFunction) {
        requireNonNull(iterable);
        requireNonNull(groupingFunction);
        return () -> Iterators2.groupBy(iterable.iterator(), groupingFunction);
    }
