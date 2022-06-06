public static InputStream asInputStream(String location) throws IOException {
		LOGGER.debug("Loading resource {}", location);
		Resource resource = asResource(location);
		return resource.getInputStream();
	}
