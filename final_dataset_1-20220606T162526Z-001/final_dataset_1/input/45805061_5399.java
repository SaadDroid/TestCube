public static ImmutableZonedDateTimeDoubleTimeSeries of(ZonedDateTime instant, double value) {
    Objects.requireNonNull(instant, "instant");
    long[] timesArray = new long[] {ZonedDateTimeToLongConverter.convertToLong(instant)};
    double[] valuesArray = new double[] {value};
    return new ImmutableZonedDateTimeDoubleTimeSeries(timesArray, valuesArray, instant.getZone());
  }
