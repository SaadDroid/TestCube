public synchronized void resetOffsets(Map<TopicPartition, Long> offsets) {
        if (offsets == null)
            throw new IllegalArgumentException("offsets cannot be null");

        // Inquire the partitions that are assigned to this consumer currently.
        Set<TopicPartition> assignedPartitions = consumer.assignment();
        LOGGER.debug("resetting offsets for assigned partitions {}", assignedPartitions);

        // Close and remove all assigned partitions, they will be regenerated as new messages are read.
        partitions.values().stream()
                .filter(partition -> assignedPartitions.contains(partition.getTopicPartition()))
                .forEach(partition -> IOUtils.closeQuietly(partition));
        partitions.keySet().removeAll(assignedPartitions);

        // Commit offsets for consumer's assigned partitions.
        Map<TopicPartition, OffsetAndMetadata> offsetsToCommit = offsets.entrySet().stream()
                .filter(e -> assignedPartitions.contains(e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> new OffsetAndMetadata(e.getValue())));
        commitOffsets(offsetsToCommit);

        // Seek consumer to the offsets that were just committed for its assigned partitions.
        offsetsToCommit.entrySet().stream().forEach(e -> consumer.seek(e.getKey(), e.getValue().offset()));
    }
