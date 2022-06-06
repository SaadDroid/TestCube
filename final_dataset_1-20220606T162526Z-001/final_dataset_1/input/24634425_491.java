@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getRoot() {
		logger.info("REQUEST to Path: /");
		
		Root root = new Root();
		root.setHref("/");
		root.setTimestamp("" + System.currentTimeMillis());
		root.setVersion("0.1-SNAPSHOT");
		
		Link link = new Link();
		link.setRel("applications");
		link.setType(MediaType.APPLICATION_XML);
		link.setHref("/applications");
		root.addLink(link);
		
		return buildResponse(Status.OK, ModelConverter.objectRootToXML(root));
	}
