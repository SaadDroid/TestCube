@Override
  public HashMap<Long, Long> getIntervals(long lowWatermarkValue, long highWatermarkValue, long partitionInterval,
      int maxIntervals) {
    Preconditions.checkArgument(partitionInterval >= 1,
        "Invalid value for partitionInterval, value should be at least 1.");
    Preconditions.checkArgument(maxIntervals > 0, "Invalid value for maxIntervals, positive value expected.");

    HashMap<Long, Long> intervalMap = new HashMap<>();
    long nextNum;
    long interval = getInterval(lowWatermarkValue, highWatermarkValue, partitionInterval, maxIntervals);
    LOG.info("Recalculated partition interval:" + interval);
    if (interval == 0) {
      return intervalMap;
    }

    long startNum = lowWatermarkValue;
    long endNum = highWatermarkValue;
    boolean longOverflow = false;

    if (startNum == endNum) {
      intervalMap.put(startNum, endNum);
      return intervalMap;
    }

    while (startNum < endNum && !longOverflow) {
      longOverflow = (Long.MAX_VALUE - interval < startNum);
      nextNum = longOverflow ? endNum : Math.min(startNum + interval, endNum);
      intervalMap.put(startNum, nextNum);
      startNum = nextNum;
    }
    return intervalMap;
  }
