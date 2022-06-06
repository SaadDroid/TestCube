@Override
    public String toString() {
        return String.format(
            "jobName: %s, shardingTotalCount: %s, shardingItems: %s, shardingItemParameters: %s, jobParameter: %s",
                getJobName(), getShardingTotalCount(), shardingItems, shardingItemParameters, getJobParameter()
            );
    }
