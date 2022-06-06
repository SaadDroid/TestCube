public long getCommittedOffset(TopicPartition topicPartition) {
        if (topicPartition == null)
            throw new IllegalArgumentException("topicPartition cannot be null");

        OffsetAndMetadata offsetAndMetadata = consumer.committed(topicPartition);
        return offsetAndMetadata == null ? -1L : offsetAndMetadata.offset();
    }
