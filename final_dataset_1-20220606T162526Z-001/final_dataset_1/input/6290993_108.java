public static <K1, K2, U, V> PTable<Pair<K1, K2>, Pair<U, V>> cross(PTable<K1, U> left, PTable<K2, V> right) {
    return cross(left, right, DEFAULT_PARALLELISM);
  }
