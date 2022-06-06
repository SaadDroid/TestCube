@Override
  public FilteredTimeSeries evaluate(final LocalDateDoubleTimeSeries ts) {
    ArgumentChecker.notNull(ts, "ts");
    if (ts.isEmpty()) {
      s_logger.info("Time series was empty");
      return new FilteredTimeSeries(EMPTY_SERIES, EMPTY_SERIES);
    }
    final int n = ts.size();
    final int[] filteredDates = new int[n];
    final double[] filteredData = new double[n];
    final int[] rejectedDates = new int[n];
    final double[] rejectedData = new double[n];
    
    LocalDateDoubleEntryIterator it = ts.iterator();
    int firstDate = it.nextTimeFast();
    double firstValue = it.currentValue();
    int secondDate = 0;
    double secondValue = 0;
    int i = 0, j = 0;
    // handle most pairs
    while (it.hasNext()) {
      secondDate = it.nextTimeFast();
      secondValue = it.currentValue();
      if (Math.abs(firstValue / secondValue - 1) < _maxPercentageMove) {
        filteredDates[i] = firstDate;
        filteredData[i++] = firstValue;
      } else {
        rejectedDates[j] = firstDate;
        rejectedData[j++] = firstValue;
      }
      firstDate = secondDate;
      firstValue = secondValue;
    }
    // handle last pair
    if (Math.abs(secondValue / firstValue - 1) < _maxPercentageMove) {
      filteredDates[i] = secondDate;
      filteredData[i++] = secondValue;
    } else {
      rejectedDates[j] = secondDate;
      rejectedData[j++] = secondValue;
    }
    return getFilteredSeries(filteredDates, filteredData, i, rejectedDates, rejectedData, j);
  }
