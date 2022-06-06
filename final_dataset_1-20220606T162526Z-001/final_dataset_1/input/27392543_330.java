@Override
  synchronized public HashMap<Long, Long> getIntervals(long lowWatermarkValue, long highWatermarkValue,
      long partitionIntervalInHours, int maxIntervals) {
    Preconditions.checkArgument(maxIntervals > 0, "Invalid value for maxIntervals, positive value expected.");
    Preconditions
        .checkArgument(partitionIntervalInHours > 0, "Invalid value for partitionInterval, should be at least 1.");
    HashMap<Long, Long> intervalMap = Maps.newHashMap();

    if (lowWatermarkValue > highWatermarkValue) {
      LOG.warn("The low water mark is greater than the high water mark, empty intervals are returned");
      return intervalMap;
    }

    final Calendar calendar = Calendar.getInstance();
    Date nextTime;
    Date lowWatermarkDate = extractFromTimestamp(Long.toString(lowWatermarkValue));
    Date highWatermarkDate = extractFromTimestamp(Long.toString(highWatermarkValue));
    final long lowWatermark = lowWatermarkDate.getTime();
    final long highWatermark = highWatermarkDate.getTime();

    int interval = getInterval(highWatermark - lowWatermark, partitionIntervalInHours, maxIntervals);
    LOG.info("Recalculated partition interval:" + interval + " hours");

    Date startTime = new Date(lowWatermark);
    Date endTime = new Date(highWatermark);
    LOG.debug("Start time:" + startTime + "; End time:" + endTime);
    long lwm;
    long hwm;

    if (startTime.getTime() == endTime.getTime()) {
      lwm = Long.parseLong(inputFormatParser.format(startTime));
      hwm = lwm;
      intervalMap.put(lwm, hwm);
      return intervalMap;
    }

    while (startTime.getTime() < endTime.getTime()) {
      lwm = Long.parseLong(inputFormatParser.format(startTime));
      calendar.setTime(startTime);
      calendar.add(Calendar.HOUR, interval);
      nextTime = calendar.getTime();
      hwm = Long.parseLong(inputFormatParser.format(nextTime.getTime() <= endTime.getTime() ? nextTime : endTime));
      intervalMap.put(lwm, hwm);
      LOG.debug("Partition - low:" + lwm + "; high:" + hwm);
      startTime = nextTime;
    }
    return intervalMap;
  }
