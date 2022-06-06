public SfcFlowClassifierUpdateTask create(SecurityGroup securityGroup, VMPort port) {
        SfcFlowClassifierUpdateTask task = new SfcFlowClassifierUpdateTask();

        task.securityGroup = securityGroup;
        task.sfc = securityGroup.getServiceFunctionChain();
        task.port = port;
        task.vmName = port.getVm() != null ? port.getVm().getName() : port.getSubnet().getName();
        task.apiFactory = this.apiFactory;
        task.name = task.getName();
        task.dbConnectionManager = this.dbConnectionManager;
        task.txBroadcastUtil = this.txBroadcastUtil;

        return task;
    }
