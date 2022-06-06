@GET
	@Produces(MediaType.APPLICATION_XML + ";qs=1")
	public Response getDeploymentXML(@PathParam("application_name") String applicationName, @PathParam("deployment_name") String deploymentName) {
		logger.info("GET request to path: /applications/" + applicationName + "/deploymentname/" + deploymentName + " [in JSON]");
		
		Deployment deployment = deploymentDAO.getDeployment(deploymentName);
		
		String json = XMLBuilder.getDeploymentXML(deployment, applicationName);
		
		return buildResponse(Status.OK, json);
	}
