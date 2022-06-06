public static <T, K, V> MutableMap<K, V> aggregateBy(
            Iterable<T> iterable,
            Function<? super T, ? extends K> groupBy,
            Function0<? extends V> zeroValueFactory,
            Function2<? super V, ? super T, ? extends V> nonMutatingAggregator)
    {
        return FJIterate.aggregateBy(
                iterable,
                groupBy,
                zeroValueFactory,
                nonMutatingAggregator,
                FJIterate.DEFAULT_MIN_FORK_SIZE);
    }
