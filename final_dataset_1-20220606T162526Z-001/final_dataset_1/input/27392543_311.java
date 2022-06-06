@Override
  synchronized public HashMap<Long, Long> getIntervals(long lowWatermarkValue, long highWatermarkValue,
      long partitionInterval, int maxIntervals) {
    Preconditions
        .checkArgument(partitionInterval >= 1, "Invalid value for partitionInterval, value should be at least 1.");
    Preconditions.checkArgument(maxIntervals > 0, "Invalid value for maxIntervals, positive value expected.");

    HashMap<Long, Long> intervalMap = new HashMap<>();

    if (lowWatermarkValue > highWatermarkValue) {
      LOG.warn(
          "lowWatermarkValue: " + lowWatermarkValue + " is greater than highWatermarkValue: " + highWatermarkValue);
      return intervalMap;
    }

    final Calendar calendar = Calendar.getInstance();
    Date nextTime;
    final long lowWatermark = toEpoch(Long.toString(lowWatermarkValue));
    final long highWatermark = toEpoch(Long.toString(highWatermarkValue));

    long interval = getInterval(highWatermark - lowWatermark, partitionInterval, maxIntervals);
    LOG.info("Recalculated partition interval:" + interval + " hours");
    if (interval == 0) {
      return intervalMap;
    }

    Date startTime = new Date(lowWatermark);
    Date endTime = new Date(highWatermark);
    LOG.debug("Sart time:" + startTime + "; End time:" + endTime);
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
      calendar.add(Calendar.HOUR, (int) interval);
      nextTime = calendar.getTime();
      hwm = Long.parseLong(inputFormatParser.format(nextTime.getTime() <= endTime.getTime() ? nextTime : endTime));
      intervalMap.put(lwm, hwm);
      LOG.debug("Partition - low:" + lwm + "; high:" + hwm);
      startTime = nextTime;
    }
    return intervalMap;
  }
