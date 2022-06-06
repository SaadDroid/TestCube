public boolean isFailover() {
        return isMonitorExecution() && Boolean.valueOf(jobNodeStorage.getJobNodeData(ConfigurationNode.FAILOVER));
    }
