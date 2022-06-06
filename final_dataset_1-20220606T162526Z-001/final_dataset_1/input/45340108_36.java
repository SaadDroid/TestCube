public Workload parse(Reader reader) throws IOException {
		ObjectMapper mapper = MapperFactory.initMapper();
		JsonNode root = mapper.readTree(reader);
		return parseWorkload(mapper, root);
	}
