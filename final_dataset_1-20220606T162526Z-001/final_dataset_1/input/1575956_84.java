public V computeIfAbsent(long key, LongFunction<V> provider) {
        checkNotNull(provider);
        long h = hash(key);
        return getSection(h).put(key, null, (int) h, true, provider);
    }
