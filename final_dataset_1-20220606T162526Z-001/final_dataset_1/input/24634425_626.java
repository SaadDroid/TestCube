@Selector(value="topic.deployment.status", reactor="@rootReactor")
	public void acceptAgreement(Event<DeploymentEvent> event) throws Exception {
		DeploymentEvent deploymentEvent = event.getData();
		logger.info("Deployment " + deploymentEvent.getDeploymentId() + " NEGOTIATED, checking if it automatica agreement");
		
		// We need first to read the deployment from the DB:
		Deployment deployment = deploymentDAO.getById(deploymentEvent.getDeploymentId());
		
		PriceModellerClient.getInstance().initializeApplication(deploymentEvent.getApplicationName(), deploymentEvent.getDeploymentId(), deployment.getSchema());

		if(deploymentEvent.getDeploymentStatus().equals(Dictionary.APPLICATION_STATUS_NEGOTIATIED) && deploymentEvent.isAutomaticNegotiation() == true) {
			
			logger.info(" Moving deployment id: " + deploymentEvent.getDeploymentId()  + " to " + Dictionary.APPLICATION_STATUS_NEGOTIATIED + " state");
			
			if(Configuration.enableSLAM.equals("yes")) {
				// We get the list of agreements
				List<Agreement> agreements = deploymentDAO.getById(deploymentEvent.getDeploymentId()).getAgreements();
				
				// We sign the first agreement
				for(Agreement agreement: agreements) {
					if(agreement.getOrderInArray() == 0) {
						SLASOITemplateParser parser = new SLASOITemplateParser();
						SLATemplate slat = parser.parseTemplate(agreement.getSlaAgreement());
						
						// We create a client to the SLAM
						NegotiationWsClient client = new NegotiationWsClient();
						SlaTranslator slaTranslator = new SlaTranslatorImplNoOsgi();
						client.setSlaTranslator(slaTranslator);
						
						logger.debug("Sending create agreement SOAP request...");
						SLA slaAgreement = client.createAgreement(Configuration.slamURL, slat, agreement.getNegotiationId());
						logger.info("SLA:");
						logger.info(slaAgreement);  
						
						// We calculate the new price, since we are not updating the SLATemplate Price I'm doing this here:
						//double price = PriceModellerClient.calculatePrice(1, deployment.getId(), 100.0);
						//deployment.setPrice("" + price);
						
						// TODO uncomment this lines when the slaAgreement it is not null
						// We store the new agreement in the db:
						//SLASOIRenderer rendeder = new SLASOIRenderer();
						//String slaAgreementString = rendeder.renderSLA(slaAgreement);
						
						agreement.setAccepted(true);
						//agreement.setSlaAgreement(slaAgreementString);
						//agreement.setPrice("" + price);
						
						// We set the SLA UUID in the document... 
						deployment = deploymentDAO.getById(deploymentEvent.getDeploymentId());
						deployment.setSlaUUID(slaAgreement.getUuid());
						
						deploymentDAO.update(deployment);
						
						agreementDAO.update(agreement);
				
						finalization(deployment, deploymentEvent);
					}
				}
			} else {
				finalization(deployment, deploymentEvent);
			}
		}
	}
