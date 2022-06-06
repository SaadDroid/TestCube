public Properties getTopicConfig(String topic) {
        if (StringUtils.isBlank(topic))
            throw new IllegalArgumentException("topic cannot be null, empty or blank");

        LOG.debug("Fetching topic config for topic [{}]", topic);

        try {
            ConfigResource resource = new ConfigResource(ConfigResource.Type.TOPIC, topic);
            Map<ConfigResource, Config> configs = getNewAdminClient()
                .describeConfigs(Collections.singleton(resource))
                .all()
                .get(operationTimeout, TimeUnit.MILLISECONDS);
            Config config = configs.get(resource);
            if (config == null) {
                throw new AdminOperationException("Unable to get topic config: " + topic);
            }

            Properties properties = new Properties();
            config.entries().stream()
                // We are only interested in any overrides that are set
                .filter(configEntry -> configEntry.source() == ConfigEntry.ConfigSource.DYNAMIC_TOPIC_CONFIG)
                .forEach(configEntry -> properties.setProperty(configEntry.name(), configEntry.value()));
            return properties;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new AdminOperationException("Unable to retrieve configuration for topic: " + topic, e);
        }
    }
