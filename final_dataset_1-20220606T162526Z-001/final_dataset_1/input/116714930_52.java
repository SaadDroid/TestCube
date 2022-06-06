@Override
    public Map<String, List<TopicPartition>> assign(Map<String, Integer> partitionsPerTopic,
                                                    Map<String, Subscription> subscriptions) {
        List<String> consumers = Utils.sorted(subscriptions.keySet());

        // Invert topics-per-consumer map to consumers-per-topic.
        Map<String, List<String>> consumersPerTopic = consumersPerTopic(subscriptions);

        // Map for tracking the total number of partitions assigned to each consumer
        Map<String, Integer> consumerAssignmentCounts = new HashMap<>();
        for (String consumer : consumers) {
            consumerAssignmentCounts.put(consumer, 0);
        }

        Map<String, List<TopicPartition>> assignment = new HashMap<>();
        for (String memberId : subscriptions.keySet()) {
            assignment.put(memberId, new ArrayList<>());
        }

        Comparator<String> consumerComparator = new ConsumerFairness(consumerAssignmentCounts);
        for (TopicPartition partition : allPartitionsSorted(partitionsPerTopic, subscriptions, consumersPerTopic)) {
            // Find the most appropriate consumer for the partition.
            String assignedConsumer = null;
            for (String consumer : consumersPerTopic.get(partition.topic())) {
                if (assignedConsumer == null || consumerComparator.compare(consumer, assignedConsumer) < 0) {
                    assignedConsumer = consumer;
                }
            }

            consumerAssignmentCounts.put(assignedConsumer, consumerAssignmentCounts.get(assignedConsumer) + 1);
            assignment.get(assignedConsumer).add(partition);
        }

        return assignment;
    }
