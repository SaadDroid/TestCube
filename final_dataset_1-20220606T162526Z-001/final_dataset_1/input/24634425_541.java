public static void sendDeploymentRenegotiatedMessage(String applicationName, Deployment deployment) {
		ApplicationManagerMessage amMessage = MessageCreator.fromDeployment(applicationName, deployment, Dictionary.APPLICATION_STATUS_RENEGOTIATED);
		
		AmqpProducer.sendMessage(APPLLICATION_PATH + "." + applicationName + "." 
                                 + DEPLOYMENT_PATH + "." + deployment.getId() + "." 
                                 + Dictionary.APPLICATION_STATUS_RENEGOTIATED, 
                                 amMessage,
                                 true);
	}
