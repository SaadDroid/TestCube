public static <V> ImmutableZonedDateTimeObjectTimeSeries<V> of(ZonedDateTime instant, V value) {
    Objects.requireNonNull(instant, "instant");
    long[] timesArray = new long[] {ZonedDateTimeToLongConverter.convertToLong(instant)};
    @SuppressWarnings("unchecked")
    V[] valuesArray = (V[]) new Object[] {value};
    return new ImmutableZonedDateTimeObjectTimeSeries<V>(timesArray, valuesArray, instant.getZone());
  }
