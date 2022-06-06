@Asynchronous
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void executeDeployment(GenerationResult generationResult, DeploymentEntity deployment, GenerationModus generationModus) {
		try {
			log.log(Level.INFO, "Starting Deployment: " + deployment.getTrackingId() + " (tracking id: " + deployment.getTrackingId() + ") " + generationModus.getName());
			execute(generationResult);
			// Handle Result
			log.log(Level.INFO, "Deployment successful: "+deployment.getId()+" (tracking id: " + deployment.getTrackingId()+")");
			deploymentExecutionResultHandler.handleSuccessfulDeployment(generationModus, generationResult);
		}
		catch (ScriptExecutionException se) {
			log.log(Level.SEVERE, "Deployment not successful: " +deployment.getId()+" (tracking id: " + deployment.getTrackingId()+")", se);
            DeploymentFailureReason reason = generationModus.equals(GenerationModus.DEPLOY) ?
                    DeploymentFailureReason.DEPLOYMENT_SCRIPT : generationModus.equals(GenerationModus.PREDEPLOY) ? DeploymentFailureReason.PRE_DEPLOYMENT_SCRIPT : DeploymentFailureReason.RUNTIME_ERROR;
			deploymentExecutionResultHandler.handleUnSuccessfulDeployment(generationModus, deployment, generationResult, se, reason);
		}
		catch (Exception e) {
			log.log(Level.SEVERE, "Deployment not successful: " + deployment.getId()+" (tracking id: " + deployment.getTrackingId()+")", e);
            DeploymentFailureReason reason = generationModus.equals(GenerationModus.DEPLOY) ?
                    DeploymentFailureReason.DEPLOYMENT_SCRIPT : generationModus.equals(GenerationModus.PREDEPLOY) ? DeploymentFailureReason.PRE_DEPLOYMENT_SCRIPT : DeploymentFailureReason.UNEXPECTED_ERROR;
			deploymentExecutionResultHandler.handleUnSuccessfulDeployment(generationModus, deployment, generationResult, e, reason);
		}
	}
