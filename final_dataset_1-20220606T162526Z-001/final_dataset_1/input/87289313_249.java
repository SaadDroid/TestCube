@Override
    public Iterable<K> apply(final Map<K, V> map) {
        return null == map ? null : map.keySet();
    }
