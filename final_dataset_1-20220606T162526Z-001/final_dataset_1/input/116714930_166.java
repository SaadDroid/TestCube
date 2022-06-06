public Map<TopicPartition, String> getConsumerGroupAssignments(String consumerGroup) {
        if (StringUtils.isBlank(consumerGroup))
            throw new IllegalArgumentException("consumerGroup cannot be null, empty or blank");

        Map<TopicPartition, String> assignments = new HashMap<>();

        Collection<AdminClient.ConsumerSummary> summaries = getConsumerGroupSummaries(consumerGroup);

        for (final AdminClient.ConsumerSummary consumerSummary : summaries) {
            Set<TopicPartition> topicPartitions = convertToJavaSet(consumerSummary.assignment().iterator());

            for (final TopicPartition topicPartition : topicPartitions) {
                assignments.put(topicPartition, consumerSummary.clientId());
            }
        }

        return Collections.unmodifiableMap(assignments);
    }
