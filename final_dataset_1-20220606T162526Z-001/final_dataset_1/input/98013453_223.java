public void createAtlasTopic(Configuration atlasProperties, String... topicNames) {
        if (atlasProperties.getBoolean(ATLAS_NOTIFICATION_CREATE_TOPICS_KEY, true)) {
            if (!handleSecurity(atlasProperties)) {
                return;
            }
            ZkUtils zkUtils = createZkUtils(atlasProperties);
            for (String topicName : topicNames) {
                try {
                    LOG.warn("Attempting to create topic {}", topicName);
                    if (!ifTopicExists(topicName, zkUtils)) {
                        createTopic(atlasProperties, topicName, zkUtils);
                    } else {
                        LOG.warn("Ignoring call to create topic {}, as it already exists.", topicName);
                    }
                } catch (Throwable t) {
                    LOG.error("Failed while creating topic {}", topicName, t);
                }
            }
            zkUtils.close();
        } else {
            LOG.info("Not creating topics {} as {} is false", StringUtils.join(topicNames, ","),
                    ATLAS_NOTIFICATION_CREATE_TOPICS_KEY);
        }
    }
