CreateK8sDeploymentTask create(DeploymentSpec ds, KubernetesDeploymentApi k8sDeploymentApi) {
        CreateK8sDeploymentTask task = new CreateK8sDeploymentTask();
        task.dbConnectionManager = this.dbConnectionManager;
        task.txBroadcastUtil = this.txBroadcastUtil;
        task.ds = ds;
        task.k8sDeploymentApi = k8sDeploymentApi;

        return task;
    }
