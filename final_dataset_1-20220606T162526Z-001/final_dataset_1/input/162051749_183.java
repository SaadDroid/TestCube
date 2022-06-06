public static <K, V> LruMap<K, V> insertionOrder(int maxEntries) {
        return new LruMap<>(maxEntries, false);
    }
