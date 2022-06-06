public int getTopicReplicationFactor(String topic) {
        if (StringUtils.isBlank(topic))
            throw new IllegalArgumentException("topic cannot be null, empty or blank");

        LOG.debug("Getting replication factor for topic [{}]", topic);

        Collection<TopicDescription> topicDescription = getTopicDescriptions(Collections.singleton(topic));
        if (topicDescription.isEmpty()) {
            throw new AdminOperationException("Unable to get description for topic: " + topic);
        }

        List<TopicPartitionInfo> topicPartitions = topicDescription.iterator().next().partitions();
        if (topicPartitions.isEmpty()) {
            throw new AdminOperationException("Unable to get partitions for topic: " + topic);
        }

        return topicPartitions.get(0).replicas().size();
    }
