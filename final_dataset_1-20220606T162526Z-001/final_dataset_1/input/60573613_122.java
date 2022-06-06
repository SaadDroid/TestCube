public void shardingIfNecessary() {
        if (!isNeedSharding()) {
            return;
        }
        if (!leaderElectionService.isLeader()) {
            blockUntilShardingCompleted();
            return;
        }
        if (configService.isMonitorExecution()) {
            waitingOtherJobCompleted();
        }
        log.debug("Elastic job: sharding begin.");
        jobNodeStorage.fillEphemeralJobNode(ShardingNode.PROCESSING, "");
        clearShardingInfo();
        JobShardingStrategy jobShardingStrategy = JobShardingStrategyFactory.getStrategy(configService.getJobShardingStrategyClass());
        JobShardingStrategyOption option = new JobShardingStrategyOption(jobName, configService.getShardingTotalCount(), configService.getShardingItemParameters());
        jobNodeStorage.executeInTransaction(new PersistShardingInfoTransactionExecutionCallback(jobShardingStrategy.sharding(serverService.getAvailableServers(), option)));
        log.debug("Elastic job: sharding completed.");
    }
