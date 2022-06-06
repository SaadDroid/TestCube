@Override
    public Map<String, List<Integer>> sharding(final List<String> serversList, final JobShardingStrategyOption option) {
        if (serversList.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<String, List<Integer>> result = shardingAliquot(serversList, option.getShardingTotalCount());
        addAliquant(serversList, option.getShardingTotalCount(), result);
        return result;
    }
