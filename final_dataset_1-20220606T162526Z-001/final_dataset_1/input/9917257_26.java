public ServiceInfo getServiceInfo(String serviceId) {
		for (ServiceInfo serviceInfo : getServiceInfos()) {
			if (serviceInfo.getId().equals(serviceId)) {
				return serviceInfo;
			}
		}
		throw new CloudException("No service with id " + serviceId + " found");
	}
