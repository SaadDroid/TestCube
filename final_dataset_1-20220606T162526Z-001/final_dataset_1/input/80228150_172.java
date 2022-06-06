public CheckPortGroupHookMetaTask create(SecurityGroupInterface sgi, boolean isDeleteTg) {
        CheckPortGroupHookMetaTask task = new CheckPortGroupHookMetaTask();
        task.sgi = sgi;
        task.isDeleteTaskGraph = isDeleteTg;
        task.allocateDai = this.allocateDai;
        task.deallocateDai = this.deallocateDai;
        task.createPortGroupHook = this.createPortGroupHook;
        task.removePortGroupHook = this.removePortGroupHook;
        task.apiFactoryService = this.apiFactoryService;
        task.dbConnectionManager = this.dbConnectionManager;
        task.txBroadcastUtil = this.txBroadcastUtil;

        return task;
    }
