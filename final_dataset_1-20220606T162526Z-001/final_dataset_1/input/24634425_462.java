@GET
	@Path("{vm_id}/events/{event_id}/power-consumption")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEventPowerConsumption(@PathParam("application_name") String applicationName, 
			                             @PathParam("deployment_id") String deploymentId,
			                             @PathParam("vm_id") String vmId,
			                             @PathParam("event_id") String eventId,
			                             @QueryParam("startTime") long startTime,
			                             @QueryParam("endTime") long endTime,
			                             @Context UriInfo uriInfo) {
		
		logger.info("GET request to path: /applications/" + applicationName 
				                            + "/deployments/" + deploymentId 
				                            + "/vms/" + vmId 
				                            + "/events/" + eventId 
				                            + "/power-consumption?"
				                            + "startTime=" + startTime
				                            + "&endTime=" + endTime);


		return getPowerComsumptionForVM(applicationName, deploymentId, vmId, eventId, startTime, endTime);
	}
