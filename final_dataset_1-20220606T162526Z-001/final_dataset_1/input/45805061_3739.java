@Override
  public Double evaluate(final DoubleTimeSeries<?>... ts) {
    ArgumentChecker.notNull(ts, "time series array");
    ArgumentChecker.isTrue(ts.length == 2, "must have two time series");
    testTimeSeries(ts[0], ts[1]);
    final DoubleTimeSeries<?> returnTS1 = ts[0];
    final DoubleTimeSeries<?> returnTS2 = ts[1];
    final int n = returnTS1.size();
    double xyMean = 0;
    double xMean = 0;
    double yMean = 0;
    final Iterator<Double> iter1 = returnTS1.valuesIterator();
    final Iterator<Double> iter2 = returnTS2.valuesIterator();
    double x, y;
    while (iter1.hasNext()) {
      x = iter1.next();
      y = iter2.next();
      xyMean += x * y;
      xMean += x;
      yMean += y;
    }
    xyMean /= n - 1;
    xMean /= n;
    yMean /= n;
    return xyMean - xMean * yMean;
  }
