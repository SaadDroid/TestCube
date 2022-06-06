public boolean isAllStarted() {
        return jobNodeStorage.isJobNodeExisted(GuaranteeNode.STARTED_ROOT) && configService.getShardingTotalCount() == jobNodeStorage.getJobNodeChildrenKeys(GuaranteeNode.STARTED_ROOT).size();
    }
