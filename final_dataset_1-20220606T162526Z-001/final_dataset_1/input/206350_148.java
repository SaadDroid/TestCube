protected InputStream openQueryStream(String entityName) throws Exception {
		return new URL(modelUrl, entityName + ".fspec").openStream();
	}
