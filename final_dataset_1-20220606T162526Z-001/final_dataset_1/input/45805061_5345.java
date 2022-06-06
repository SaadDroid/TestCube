public static <V> ImmutableLocalDateObjectTimeSeries<V> of(LocalDate date, V value) {
    Objects.requireNonNull(date, "date");
    int[] timesArray = new int[] {LocalDateToIntConverter.convertToInt(date)};
    @SuppressWarnings("unchecked")
    V[] valuesArray = (V[]) new Object[] {value};
    return new ImmutableLocalDateObjectTimeSeries<V>(timesArray, valuesArray);
  }
