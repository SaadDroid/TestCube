public static ApplicationManagerMessage fromApplication(Application application) {
		
		if(application == null) {
			return null;
		}
		
		ApplicationManagerMessage message = new ApplicationManagerMessage();
		
		message.setApplicationId(application.getName());
		
		if(application.getDeployments() != null && application.getDeployments().size() > 0) {
			completeMessage(message, application.getDeployments().get(0), null);
		}
		
		return message;
	}
