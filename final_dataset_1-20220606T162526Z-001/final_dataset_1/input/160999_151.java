public Map<String, Object> toMap() {
        Map<String, Object> conf = new LinkedHashMap<String, Object>();
        conf.put(KEY_CLIENT_PORT, clientPort);
        conf.put(KEY_DATA_DIR, dataDir);
        conf.put(KEY_DATA_LOG_DIR, dataLogDir);
        conf.put(KEY_TICK_TIME, tickTime);
        conf.put(KEY_MAX_CLIENT_CNXNS, maxClientCnxnsPerHost);
        conf.put(KEY_MIN_SESSION_TIMEOUT, minSessionTimeout);
        conf.put(KEY_MAX_SESSION_TIMEOUT, maxSessionTimeout);
        conf.put(KEY_SERVER_ID, serverId);
        conf.put(KEY_CLIENT_PORT_LISTEN_BACKLOG, clientPortListenBacklog);
        return conf;
    }
