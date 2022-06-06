public static <T> Set<T> create(final int maxSize) {
    return Collections.newSetFromMap(LimitedMap.create(maxSize));
  }
