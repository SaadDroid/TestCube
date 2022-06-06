public static String getCollectionOfDeploymentsXML(List<Deployment> deployments, String applicationId) {
		Collection collection = addCollectionOfDeploymentsInfo(deployments, applicationId);
		
		return ModelConverter.objectCollectionToXML(collection);
	}
