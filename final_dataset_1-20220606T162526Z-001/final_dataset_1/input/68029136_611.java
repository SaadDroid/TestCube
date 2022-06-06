public void confirm(String username) {
        setDeploymentState(DeploymentState.scheduled);
        setDeploymentConfirmationDate(new Date());
        setDeploymentConfirmationUser(username);
        deploymentConfirmed = true;
    }
