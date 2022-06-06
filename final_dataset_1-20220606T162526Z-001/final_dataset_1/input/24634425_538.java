public static void sendVMDeployedMessage(String applicationName, Deployment deployment, VM vm) {
		ApplicationManagerMessage amMessage = MessageCreator.fromVM(applicationName, deployment, vm);
		
		AmqpProducer.sendMessage(APPLLICATION_PATH + "." + applicationName + "." 
                                 + DEPLOYMENT_PATH + "." + deployment.getId() + "." 
                                 + VM_PATH + "." + vm.getId() + "."
                                 + Dictionary.APPLICATION_STATUS_DEPLOYED, 
                                 amMessage,
                                 true);
	}
