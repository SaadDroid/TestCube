public static String getCollectionOfDeploymentsJSON(List<Deployment> deployments, String applicationId) {
		Collection collection = addCollectionOfDeploymentsInfo(deployments, applicationId);
		
		return ModelConverter.objectCollectionToJSON(collection);
	}
