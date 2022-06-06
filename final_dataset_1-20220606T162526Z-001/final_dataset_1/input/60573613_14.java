@Override
    public JobSettings getJobSettings(final String jobName) {
        JobSettings result = new JobSettings();
        JobNodePath jobNodePath = new JobNodePath(jobName);
        result.setJobName(jobName);
        result.setJobClass(registryCenter.get(jobNodePath.getConfigNodePath("jobClass")));
        result.setShardingTotalCount(Integer.parseInt(registryCenter.get(jobNodePath.getConfigNodePath("shardingTotalCount"))));
        result.setCron(registryCenter.get(jobNodePath.getConfigNodePath("cron")));
        result.setShardingItemParameters(registryCenter.get(jobNodePath.getConfigNodePath("shardingItemParameters")));
        result.setJobParameter(registryCenter.get(jobNodePath.getConfigNodePath("jobParameter")));
        result.setMonitorExecution(Boolean.valueOf(registryCenter.get(jobNodePath.getConfigNodePath("monitorExecution"))));
        result.setProcessCountIntervalSeconds(Integer.parseInt(registryCenter.get(jobNodePath.getConfigNodePath("processCountIntervalSeconds"))));
        result.setConcurrentDataProcessThreadCount(Integer.parseInt(registryCenter.get(jobNodePath.getConfigNodePath("concurrentDataProcessThreadCount"))));
        result.setFetchDataCount(Integer.parseInt(registryCenter.get(jobNodePath.getConfigNodePath("fetchDataCount"))));
        result.setMaxTimeDiffSeconds(Integer.parseInt(registryCenter.get(jobNodePath.getConfigNodePath("maxTimeDiffSeconds"))));
        String monitorPort = registryCenter.get(jobNodePath.getConfigNodePath("monitorPort"));
        if (!Strings.isNullOrEmpty(monitorPort)) {
            result.setMonitorPort(Integer.parseInt(monitorPort));
        }
        result.setFailover(Boolean.valueOf(registryCenter.get(jobNodePath.getConfigNodePath("failover"))));
        result.setMisfire(Boolean.valueOf(registryCenter.get(jobNodePath.getConfigNodePath("misfire"))));
        result.setJobShardingStrategyClass(registryCenter.get(jobNodePath.getConfigNodePath("jobShardingStrategyClass")));
        result.setDescription(registryCenter.get(jobNodePath.getConfigNodePath("description")));
        result.setScriptCommandLine(registryCenter.get(jobNodePath.getConfigNodePath("scriptCommandLine")));
        return result;
    }
