@Override
    public DeallocateDAIOfSGIMembersTask create(SecurityGroupInterface sgi, DistributedApplianceInstance dai) {
        DeallocateDAIOfSGIMembersTask task = new DeallocateDAIOfSGIMembersTask(sgi, dai);
        task.dbConnectionManager = this.dbConnectionManager;
        task.txBroadcastUtil = this.txBroadcastUtil;

        return task;
    }
