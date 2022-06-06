long getStartOffset(final long nextOffset, final long nextEventTime, final int partition) {
    // This should never happen
    Preconditions.checkArgument(nextOffset > 0, "Invalid checkpoint offset");

    // Get BrokerInfo for constructing SimpleConsumer
    String topic = config.getTopic();
    BrokerInfo brokerInfo = brokerService.getLeader(topic, partition);
    if (brokerInfo == null) {
      throw new LeaderNotAvailableException(
        String.format("BrokerInfo from BrokerService is null for topic %s partition %d. Will retry in next run.",
                      topic, partition));
    }
    SimpleConsumer consumer = new SimpleConsumer(brokerInfo.getHost(), brokerInfo.getPort(),
                                                 SO_TIMEOUT_MILLIS, BUFFER_SIZE,
                                                 "offset-finder-" + topic + "-" + partition);

    // Check whether the message fetched with the offset in the given checkpoint has the timestamp from
    // checkpoint.getNextOffset() - 1 to get the offset corresponding to the timestamp in checkpoint
    long offset = nextOffset - 1;
    try {
      long timestamp = getEventTimeByOffset(consumer, partition, offset);
      if (timestamp == nextEventTime) {
        return nextOffset;
      }
      // This can happen in replicated cluster
      LOG.debug("Event timestamp in {}:{} at offset {} is {}. It doesn't match with checkpoint timestamp {}",
                topic, partition, offset, timestamp, nextEventTime);
    } catch (NotFoundException | OffsetOutOfRangeException e) {
      // This means we can't find the timestamp. This can happen in replicated cluster
      LOG.debug("Cannot get valid log event in {}:{} at offset {}", topic, partition, offset);
    }

    // Find offset that has an event that matches the timestamp
    long startOffset = findStartOffset(consumer, partition, nextEventTime);
    LOG.debug("Found new nextOffset {} for topic {} partition {} with existing offset {} and event time {}.",
              startOffset, topic, partition, nextOffset, nextEventTime);
    return startOffset;
  }
