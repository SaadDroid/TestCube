@Override
  public Map<TopicPartition, Long> readLatestOffsets() throws IOException {
    List<Long> storedOffsetPersistenceTimes = getStoredOffsetPersistenceTimes(true);
    if (storedOffsetPersistenceTimes.isEmpty()) {
      return Collections.emptyMap();
    }

    long persistedTime = storedOffsetPersistenceTimes.get(0);

    Map<TopicPartition, Long> offsets = readOffsets(persistedTime);

    return offsets == null ? Collections.<TopicPartition, Long>emptyMap() : offsets;
  }
