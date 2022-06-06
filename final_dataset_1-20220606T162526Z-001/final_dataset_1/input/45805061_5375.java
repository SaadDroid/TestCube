public static ImmutableInstantDoubleTimeSeries of(Instant instant, double value) {
    Objects.requireNonNull(instant, "instant");
    long[] timesArray = new long[] {InstantToLongConverter.convertToLong(instant)};
    double[] valuesArray = new double[] {value};
    return new ImmutableInstantDoubleTimeSeries(timesArray, valuesArray);
  }
