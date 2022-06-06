public void deleteDeployment(String uid, String namespace, String name) throws VmidcException {
        if (uid == null) {
            throw new IllegalArgumentException("Uid should not be null");
        }

        if (name == null) {
            throw new IllegalArgumentException("Name should not be null");
        }

        if (namespace == null) {
            throw new IllegalArgumentException("Namespace should not be null");
        }

        KubernetesDeployment deployment = getDeploymentById(uid, namespace, name);
        if (deployment == null) {
            LOG.info(String.format("The deployment with id %s, name %s and namespace %s was not found. Nothing to do.", uid, name, namespace));
            return;
        }

        try {
            getKubernetesClient().resource(deployment.getDeploymentResource()).delete();
        } catch (KubernetesClientException e) {
            throw new VmidcException("Failed to delete the deployment");
        }
    }
