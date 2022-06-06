@GET
	@Path("{deployment_id}/events/{event_id}/cost-estimation")
	@Produces(MediaType.APPLICATION_XML)
	public Response getCostEstimation(@PathParam("application_name") String applicationName, 
			                          @PathParam("deployment_id") String deploymentId,
			                          @PathParam("event_id") String eventId) throws InterruptedException {
		logger.info("GET request to path: /applications/" + applicationName + "/deployments/" + deploymentId + "/events/" + eventId + "/cost-estimation");
				
		energyModeller = getEnergyModeller();
		
		int deploymentIdInt = Integer.parseInt(deploymentId);
		Deployment deployment = deploymentDAO.getById(deploymentIdInt);
		List<String> ids = getVmsIds(deployment);
		String providerId = deployment.getProviderId();
		
		logger.debug("Connecting to Energy Modeller");

		double energyEstimated = energyModeller.estimate(providerId,  applicationName, deploymentId, ids, eventId, Unit.ENERGY, 0l);
		double powerEstimated = energyModeller.estimate(providerId,  applicationName, deploymentId, ids, eventId, Unit.POWER, 0l);
		
		// Getting from the queue the necessary variables to query the Price Modeller
		String secKey = "none";
		if(ids != null && ids.size() > 0) {
			List<String> vmIds = new ArrayList<String>();
			vmIds.add(ids.get(0));
			secKey = EnergyModellerQueueController.generateKey(applicationName, eventId, deploymentId, vmIds, EnergyModellerQueueController.SEC);
		}
		
		logger.info("secKey: " + secKey);
		
		Thread.sleep(1000l);
		
		EnergyModellerMessage emMessageSec = getEnergyModellerQueueController().getPredictionMessage(secKey); 
		
		logger.info("############################################################################################");
		logger.info("Message recevied by energy modeller in cost-estimation: " + emMessageSec);
		
		Cost cost = new Cost();
		cost.setEnergyValue(energyEstimated);
		cost.setPowerValue(powerEstimated);
		
		if(emMessageSec != null) {
			logger.info("Parsing duration value of: " + emMessageSec.getValue());
			
			long duration = (long) Double.parseDouble(emMessageSec.getValue());
			
			LinkedList<VMinfo> vmInfos = new LinkedList<VMinfo>();
			for(VM vm : deployment.getVms()) {
				 VMinfo vmInfo = new VMinfo(vm.getRamActual(), 
						 					vm.getCpuActual(), 
						 					vm.getDiskActual(),
						 					duration);
				 
				 vmInfos.add(vmInfo);
			}
						
			if(priceModellerClient == null) {
				priceModellerClient = PriceModellerClient.getInstance();
			}
			
			System.out.println("######## deploymentId: " + deploymentIdInt + " energyEstimated: " + energyEstimated + " schema: " + deployment.getSchema() + " duration: " + duration);
			
			double charges = priceModellerClient.getEventPredictedChargesOfApp(deploymentIdInt, vmInfos, energyEstimated, deployment.getSchema());
			cost.setCharges(charges);
		} else {
			cost.setCharges(-1.0d);
		}
		
		// We create the XMl response
		String xml = XMLBuilder.getCostEstimationForAnEventInADeploymentXMLInfo(cost, applicationName, deploymentId, eventId);
				
		return buildResponse(Status.OK, xml);
	}
