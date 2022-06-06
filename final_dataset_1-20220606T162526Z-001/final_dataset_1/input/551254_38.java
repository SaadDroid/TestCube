@Override
	public void deploy(String pathToTest, ProcessUnderTest processUnderTest)
			throws DeploymentException {

		checkThatSpecified(this.deploymentLocation, "Location for Deployment Archive (BPR) was not configured.");
		
		ActiveVOSAdministrativeFunctions activevos = getAdministrativeFunctions();
		
		if(terminatePendingProcessesBeforeTestSuiteIsRun) {
			logger.info("Terminating running processes prior to test suite run...");
			activevos.terminateAllProcessInstances();
		}
		
		if(doUndeploy) {
			logger.info("Fetching current contributions on server...");
			previouslyDeployedContributions = activevos.getAllContributions();
		}
		
		try {
			File bprFile = new File(getArchiveLocation(pathToTest));

			if(!bprFile.isFile() || !bprFile.canRead()) {
				throw new DeploymentException("Cannot find or read BPR archive '" + bprFile.getAbsolutePath() + "'");
			}
			
			byte[] bprContents = FileUtil.readFile(bprFile);
			String fileName = new File(deploymentLocation).getName();
			
			logger.info("Deploying " + fileName + "...");
			activevos.deployBpr(fileName, bprContents);
			
		} catch(IOException e) {
			throw new DeploymentException("Error while deploying: " + e.getMessage(), e);
		} catch (DeployException e) {
			throw new DeploymentException("Error while deploying: " + e.getMessage(), e);
		}
	}
