public AdminClient.ConsumerGroupSummary getConsumerGroupSummary(String consumerGroup) {
        if (StringUtils.isBlank(consumerGroup))
            throw new IllegalArgumentException("consumerGroup cannot be null, empty or blank");

        try {
            return getAdminClient().describeConsumerGroup(consumerGroup, operationTimeout);
        } catch (KafkaException e) {
            throw new AdminOperationException("Unable to retrieve summary for consumer group: " + consumerGroup, e);
        }
    }
