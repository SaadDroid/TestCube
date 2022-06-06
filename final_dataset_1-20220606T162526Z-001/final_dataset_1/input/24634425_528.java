public static void sendDeploymentSubmittedMessage(Application application) {
		ApplicationManagerMessage amMessage = MessageCreator.fromApplication(application);
		
		AmqpProducer.sendMessage(APPLLICATION_PATH + "." + application.getName() + "." 
		                         + DEPLOYMENT_PATH + "." + application.getDeployments().get(0).getId() + "." 
				                 + Dictionary.APPLICATION_STATUS_SUBMITTED, 
								 amMessage,
								 true);
	}
