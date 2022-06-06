public static String getDeploymentXML(Deployment deployment, String applicationId) {
		deployment = addDeploymentXMLInfo(deployment, applicationId);
		return ModelConverter.objectDeploymentToXML(deployment);
	}
