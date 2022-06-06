@Override
  public boolean nextKeyValue() throws IOException, InterruptedException {
    if (hasPendingData()) {
      loadRecords();
      record = recordIterator.hasNext() ? recordIterator.next() : null;
      if (record != null) {
        LOG.debug("nextKeyValue: Retrieved record with offset {}", record.offset());
        long oldOffset = currentOffset;
        currentOffset = record.offset();
        LOG.debug("Current offset will be updated to be [{}]", currentOffset);
        if (LOG.isWarnEnabled() && (currentOffset - oldOffset > 1)) {
          // The most likely scenario here is our start offset was deleted and an offset reset took place by the consumer
          LOG.warn("Possible data loss in partition {} as offset {} was larger than expected {}",
                  new Object[] { topicPartition, currentOffset, oldOffset + 1});
        }

        if (currentOffset >= endingOffset) {
          // We had pending data but read a record beyond our end offset so don't include it and stop reading
          if (LOG.isWarnEnabled())
            LOG.warn("Record offset {} is beyond our end offset {}. This could indicate data loss in partition {}",
                  new Object[] { currentOffset, endingOffset, topicPartition});
          record = null;
          return false;
        }

        return true;
      } else if (isPartitionEmpty()) {
        // If the partition is empty but we are expecting to read data we would read no records and
        // see no errors so handle that here
        if (LOG.isWarnEnabled())
          LOG.warn("The partition {} is empty though we expected to read from {} to {}. This could indicate data loss",
                  new Object[] {topicPartition, currentOffset, endingOffset});
      } else {
        // We have pending data but we are unable to fetch any records so throw an exception and stop the job
        throw new IOException("Unable to read additional data from Kafka. See logs for details. Partition " +
                topicPartition + " Current Offset: " + currentOffset + " End Offset: " + endingOffset);
      }
    }
    record = null;
    return false;
  }
