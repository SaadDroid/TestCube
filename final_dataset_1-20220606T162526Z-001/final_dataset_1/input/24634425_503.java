@GET
	@Path("{deployment_id}/events/{event_id}/energy-estimation")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEnergyEstimationForEvent(@PathParam("application_name") String applicationName, 
												@PathParam("deployment_id") String deploymentId, 
												@PathParam("event_id") String eventId,
												@QueryParam("duration") String durationQuery) {
		logger.info("GET request to path: /applications/" + applicationName + "/deployments/" + deploymentId + "/events/" + eventId + "/energy-estimation");
		
		long duration = 0l;
		
		if(durationQuery != null) {
			duration = Long.parseLong(durationQuery);
		}

		double energyConsumed = getPowerOrEnergyEstimationPerEvent(applicationName, deploymentId, eventId, Unit.ENERGY, duration);
		
		EnergyMeasurement energyMeasurement = new EnergyMeasurement();
		energyMeasurement.setValue(energyConsumed);
		
		// We create the XMl response
		String xml = XMLBuilder.getEnergyEstimationForDeploymentXMLInfo(energyMeasurement, applicationName, deploymentId, eventId);
				
		return buildResponse(Status.OK, xml);
	}
