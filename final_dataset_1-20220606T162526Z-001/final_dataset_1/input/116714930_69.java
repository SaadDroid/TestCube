public Map<TopicPartition, Long> getOffsetsForTimes(Collection<String> topics, long time) {
        if (topics == null)
            throw new IllegalArgumentException("topics cannot be null");

        Collection<TopicPartition> partitions = getPartitionsFor(topics);

        //Find all the offsets at a specified time.
        Map<TopicPartition, Long> topicTimes = getPartitionsFor(topics)
                .stream().collect(Collectors.toMap(Function.identity(), s -> time));
        Map<TopicPartition, OffsetAndTimestamp> foundOffsets = consumer.offsetsForTimes(topicTimes);

        //merge the offsets together into a single collection.
        Map<TopicPartition, Long> offsets = new HashMap<>();
        offsets.putAll(foundOffsets.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().offset())));

        //if some partitions do not have offsets at the specified time, find the latest offsets of the partitions for that time.
        List<TopicPartition> missingPartitions = partitions.stream()
                .filter(t -> !foundOffsets.containsKey(t)).collect(Collectors.toList());
        if(!missingPartitions.isEmpty()) {
            Map<TopicPartition, Long> missingOffsets = consumer.endOffsets(missingPartitions);
            offsets.putAll(missingOffsets);
        }

        return offsets;
    }
