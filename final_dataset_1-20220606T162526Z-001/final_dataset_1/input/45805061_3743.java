protected void testTimeSeries(final DoubleTimeSeries<?> ts1, final DoubleTimeSeries<?> ts2) {
    testTimeSeriesSize(ts1, 2);
    testTimeSeriesSize(ts2, 2);
    testTimeSeriesDates(ts1, ts2);
  }
