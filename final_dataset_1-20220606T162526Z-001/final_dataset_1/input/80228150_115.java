public ConformK8sDeploymentSpecInspectionPortsMetaTask create(DeploymentSpec ds) {
        ConformK8sDeploymentSpecInspectionPortsMetaTask task = new ConformK8sDeploymentSpecInspectionPortsMetaTask();
        task.deleteK8sDAIInspectionPortTask = this.deleteK8sDAIInspectionPortTask;
        task.registerK8sDAIInspectionPortTask = this.registerK8sDAIInspectionPortTask;
        task.ds = ds;
        task.dbConnectionManager = this.dbConnectionManager;
        task.txBroadcastUtil = this.txBroadcastUtil;
        return task;
    }
