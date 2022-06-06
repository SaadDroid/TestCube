File findCloudPropertiesFileFromClasspath() {
		// see if we have a spring-cloud.properties at all
		InputStream in = getClass().getClassLoader().getResourceAsStream(classpathPropertiesFilename);
		if (in == null) {
			logger.info("no " + classpathPropertiesFilename
					+ " found on the classpath to direct us to an external properties file");
			return null;
		}

		// load it as a properties file
		Properties properties = new Properties();
		try {
			properties.load(in);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "found " + classpathPropertiesFilename
					+ " on the classpath but couldn't load it as a properties file", e);
			return null;
		}

		// read the spring.cloud.propertiesFile property from it
		String template = properties.getProperty(LocalConfigConnector.PROPERTIES_FILE_PROPERTY);
		if (template == null) {
			logger.log(Level.SEVERE, "found properties file " + classpathPropertiesFilename
					+ " on the classpath, but it didn't contain a property named " + LocalConfigConnector.PROPERTIES_FILE_PROPERTY);
			return null;
		}

		// if there's anything else, the client probably tried to put an app ID or other credentials there
		if (properties.entrySet().size() > 1)
			logger.warning("the properties file " + classpathPropertiesFilename + " contained properties besides "
					+ LocalConfigConnector.PROPERTIES_FILE_PROPERTY + "; ignoring");

		logger.fine("substituting system properties into '" + template + "'");
		File configFile = new File(new StrSubstitutor(systemPropertiesLookup(env)).replace(template));
		logger.info("derived configuration file name: " + configFile);

		return configFile;
	}
