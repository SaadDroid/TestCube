public CreateK8sLabelPodTask create(KubernetesPod k8sPod, Label label) {
        CreateK8sLabelPodTask task = new CreateK8sLabelPodTask();
        task.k8sPod = k8sPod;
        task.label = label;
        task.apiFactoryService = this.apiFactoryService;
        task.dbConnectionManager = this.dbConnectionManager;
        task.txBroadcastUtil = this.txBroadcastUtil;
        return task;
    }
