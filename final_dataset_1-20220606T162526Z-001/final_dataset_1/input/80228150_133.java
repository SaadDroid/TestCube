public DeleteK8sLabelPodTask create(Pod pod, Label label) {
        DeleteK8sLabelPodTask task = new DeleteK8sLabelPodTask();
        task.pod = pod;
        task.label = label;
        task.dbConnectionManager = this.dbConnectionManager;
        task.txBroadcastUtil = this.txBroadcastUtil;
        return task;
    }
