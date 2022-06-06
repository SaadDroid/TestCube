public static ZookeeperProperties getZookeeperProperties(Configuration configuration) {
        String[] zkServers;
        if (configuration.containsKey(HA_ZOOKEEPER_CONNECT)) {
            zkServers = configuration.getStringArray(HA_ZOOKEEPER_CONNECT);
        } else {
            zkServers = configuration.getStringArray("atlas.kafka." + ZOOKEEPER_PREFIX + "connect");
        }

        String zkRoot = configuration.getString(ATLAS_SERVER_HA_ZK_ROOT_KEY, ATLAS_SERVER_ZK_ROOT_DEFAULT);
        int retriesSleepTimeMillis = configuration.getInt(HA_ZOOKEEPER_RETRY_SLEEPTIME_MILLIS,
                DEFAULT_ZOOKEEPER_CONNECT_SLEEPTIME_MILLIS);

        int numRetries = configuration.getInt(HA_ZOOKEEPER_NUM_RETRIES, DEFAULT_ZOOKEEPER_CONNECT_NUM_RETRIES);

        int sessionTimeout = configuration.getInt(HA_ZOOKEEPER_SESSION_TIMEOUT_MS,
                DEFAULT_ZOOKEEPER_SESSION_TIMEOUT_MILLIS);

        String acl = configuration.getString(HA_ZOOKEEPER_ACL);
        String auth = configuration.getString(HA_ZOOKEEPER_AUTH);

        return new ZookeeperProperties(StringUtils.join(zkServers, ','),
                                       zkRoot,
                                       retriesSleepTimeMillis, numRetries,
                                       sessionTimeout, acl, auth);
    }
