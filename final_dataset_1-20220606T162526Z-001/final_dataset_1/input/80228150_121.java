public CreateOrUpdateK8sDAITask create(DeploymentSpec ds, KubernetesPod k8sPod) {
        return create(ds, k8sPod, null);
    }
