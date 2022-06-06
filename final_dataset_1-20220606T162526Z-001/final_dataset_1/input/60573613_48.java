@Override
    public Map<String, List<Integer>> sharding(final List<String> serversList, final JobShardingStrategyOption option) {
        long jobNameHash = option.getJobName().hashCode();
        if (0 == jobNameHash % 2) {
            Collections.reverse(serversList);
        }
        return averageAllocationJobShardingStrategy.sharding(serversList, option);
    }
