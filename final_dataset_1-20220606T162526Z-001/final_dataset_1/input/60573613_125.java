public List<Integer> getLocalHostShardingItems() {
        String ip = localHostService.getIp();
        if (!jobNodeStorage.isJobNodeExisted(ShardingNode.getShardingNode(ip))) {
            return Collections.emptyList();
        }
        return ItemUtils.toItemList(jobNodeStorage.getJobNodeDataDirectly(ShardingNode.getShardingNode(ip)));
    }
