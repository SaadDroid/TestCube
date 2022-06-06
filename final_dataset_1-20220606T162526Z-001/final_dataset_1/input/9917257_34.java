@Override
	public boolean isInMatchingCloud() {
		if (fileProperties == null)
			readFileProperties();

		String appId = findProperty(APP_ID_PROPERTY);

		if (appId == null)
			logger.info("the property " + APP_ID_PROPERTY + " was not found in the system properties or configuration file");

		return appId != null;
	}
