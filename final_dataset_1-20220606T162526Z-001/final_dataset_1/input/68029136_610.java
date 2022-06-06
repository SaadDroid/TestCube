public void reject(String username) {
        setDeploymentState(DeploymentState.rejected);
        setDeploymentConfirmationDate(new Date());
        setDeploymentConfirmationUser(username);
        deploymentConfirmed = false;
    }
