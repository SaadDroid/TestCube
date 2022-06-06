public boolean isPredeploymentFinished() {
        boolean hasPredeploymnets = false;
        boolean allFinished = true;

		for (NodeJobEntity job : this.getNodeJobs()) {
            if (DeploymentState.PRE_DEPLOYMENT.equals(job.getDeploymentState())) {
                hasPredeploymnets = true;
                if (NodeJobEntity.NodeJobStatus.RUNNING.equals(job.getStatus())) {
                    allFinished=false;
                    break;
                }
			}
		}
		return hasPredeploymnets && allFinished;
	}
