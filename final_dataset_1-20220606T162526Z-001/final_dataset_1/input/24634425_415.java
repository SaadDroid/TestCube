public static EnergyMeasurement addEnergyEstimationForDeploymentXMLInfo(EnergyMeasurement energyMeasurement, 
																			String applicationId, 
																			String deploymentId, 
																			String eventId) {
		
		return addEnergyConsumptionForDeploymentXMLInfo(energyMeasurement, applicationId, deploymentId, eventId, "estimation");
	}
