public static <V> ImmutableInstantObjectTimeSeries<V> of(Instant instant, V value) {
    Objects.requireNonNull(instant, "instant");
    long[] timesArray = new long[] {InstantToLongConverter.convertToLong(instant)};
    @SuppressWarnings("unchecked")
    V[] valuesArray = (V[]) new Object[] {value};
    return new ImmutableInstantObjectTimeSeries<V>(timesArray, valuesArray);
  }
