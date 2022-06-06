public void registerJobCompleted(final JobExecutionMultipleShardingContext shardingContext) {
        executionService.registerJobCompleted(shardingContext);
        if (configService.isFailover()) {
            failoverService.updateFailoverComplete(shardingContext.getShardingItems());
        }
    }
