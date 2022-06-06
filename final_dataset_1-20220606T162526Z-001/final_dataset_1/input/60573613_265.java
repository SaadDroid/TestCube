public JobExecutionMultipleShardingContext getJobExecutionShardingContext(final List<Integer> shardingItems) {
        JobExecutionMultipleShardingContext result = new JobExecutionMultipleShardingContext();
        result.setJobName(jobConfiguration.getJobName());
        result.setShardingTotalCount(configService.getShardingTotalCount());
        result.setShardingItems(shardingItems);
        boolean isMonitorExecution = configService.isMonitorExecution();
        if (isMonitorExecution) {
            removeRunningItems(shardingItems);
        }
        result.setJobParameter(configService.getJobParameter());
        result.setMonitorExecution(isMonitorExecution);
        result.setFetchDataCount(configService.getFetchDataCount());
        if (result.getShardingItems().isEmpty()) {
            return result;
        }
        Map<Integer, String> shardingItemParameters = configService.getShardingItemParameters();
        for (int each : result.getShardingItems()) {
            if (shardingItemParameters.containsKey(each)) {
                result.getShardingItemParameters().put(each, shardingItemParameters.get(each));
            }
        }
        result.setOffsets(offsetService.getOffsets(result.getShardingItems()));
        return result;
    }
