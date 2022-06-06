public String getHostname(){
		if(nodeProperties != null){
			FreeMarkerProperty hostname = nodeProperties.getProperty(HOST_NAME);
			if(hostname != null){
				return hostname.getCurrentValue();
			}
		}
		return null;
	}
