public void createTopic(String topic, int partitions, int replicationFactor) {
        createTopic(topic, partitions, replicationFactor, new Properties());
    }
