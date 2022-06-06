public static <T extends Enum<T>> Map<String, T> enumConstants(
      Class<T> clazz) {
    final T[] ts = clazz.getEnumConstants();
    if (ts == null) {
      // not an enum type
      return null;
    }
    ImmutableMap.Builder<String, T> builder = ImmutableMap.builder();
    for (T t : ts) {
      builder.put(t.name(), t);
    }
    return builder.build();
  }
