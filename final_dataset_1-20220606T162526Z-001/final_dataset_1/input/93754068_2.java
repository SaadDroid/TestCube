@Override
    public void log(MonitoringEntry log) {
        logger.debug("Indexing log entry: {}", log.toJson());
        elasticClient.put(log.toJson());
    }
