public static String generateKey(EnergyModellerMessage emMessage) {
		
		if(emMessage != null) {
			return generateKey(emMessage.getApplicationid(), emMessage.getEventid(), emMessage.getDeploymentid(), emMessage.getVms(), emMessage.getUnit());
		} else {
			return null;
		}
	}
