@GET
	@Path("{vm_id}/events/{event_id}/energy-sample")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEnergySample(@PathParam("application_name") String applicationName, 
			                             @PathParam("deployment_id") String deploymentId,
			                             @PathParam("vm_id") String vmId,
			                             @PathParam("event_id") String eventId,
			                             @DefaultValue("0") @QueryParam("startTime") long startTime,
			                             @DefaultValue("0") @QueryParam("endTime") long endTime,
			                             @DefaultValue("0") @QueryParam("interval") long interval) {
		
		logger.info("GET request to path: /applications/" + applicationName 
							                + "/deployments/" + deploymentId 
							                + "/vms/" + vmId 
							                + "/events/" + eventId 
							                + "/energy-sample?"
							                + "startTime=" + startTime
							                + "&endTime=" + endTime 
							                + "&interval=" + interval);
		
		
		
		if(startTime == 0 || endTime == 0) {
			return  buildResponse(Status.BAD_REQUEST, "It is mandatory to specify startTime and endTime!!!");
		} else {
			String payload = null;
			// We get the id of the VM
			VM vm = vmDAO.getById(Integer.parseInt(vmId));
			List<String> vmIds = new ArrayList<String>();
			vmIds.add("" + vm.getId());
			
			Timestamp startStamp = new Timestamp(startTime);
			Timestamp endStamp = new Timestamp(endTime);
			
			if(interval == 0) {
				List<eu.ascetic.paas.applicationmanager.model.EventSample> samples = null;
				// Going for energyApplicationConsumptionData
				List<EventSample> eSamples = energyModeller.eventsData(null, applicationName, deploymentId, vmIds, eventId, startStamp, endStamp);
				
				samples = EnergyModellerConverter.convertList(eSamples);
				
				payload = XMLBuilder.getEventSampleCollectionXMLInfo(samples, applicationName, deploymentId, vmId, eventId);
			} 
			
			return  buildResponse(Status.OK, payload);
		}
	}
