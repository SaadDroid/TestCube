protected synchronized void checkForEndlessDeployments() {
		log.log(Level.FINE, "Checking deployments inProgress which reached the timeout");
		List<DeploymentEntity> deployments = deploymentBoundary.getDeploymentsInProgressTimeoutReached();
		if (!deployments.isEmpty()) {
			log.log(logLevel, deployments.size() + " deployments inProgress reached timeout");
			int timeout = ConfigurationService.getPropertyAsInt(ConfigKey.DEPLOYMENT_IN_PROGRESS_TIMEOUT);
			handleDeploymentsTimeout(deployments, GenerationModus.DEPLOY, timeout);
		}
		else {
			log.log(Level.FINE, "No deployments inProgress have reached the timeout");
		}
	}
