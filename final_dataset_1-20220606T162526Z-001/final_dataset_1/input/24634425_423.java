public static String getPowerConsumptionForDeploymentXMLInfo(PowerMeasurement powerMeasurement, String applicationName,	String deploymentId, String eventId) {
		powerMeasurement = XMLBuilder.addPowerConsumptionForDeploymentXMLInfo(powerMeasurement, applicationName, deploymentId, eventId);
		return ModelConverter.objectPowerMeasurementToXML(powerMeasurement);
	}
