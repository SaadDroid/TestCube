@Override
    public Map<String, List<Integer>> sharding(final List<String> serversList, final JobShardingStrategyOption option) {
        return averageAllocationJobShardingStrategy.sharding(rotateServerList(serversList, option.getJobName()), option);
    }
