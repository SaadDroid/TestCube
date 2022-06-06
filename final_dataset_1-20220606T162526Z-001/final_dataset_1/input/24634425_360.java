@GET
	@Path("/{id}")
	@Produces(CONTENT_TYPE_XML + ";qs=1")
	public Response getProvider(@PathParam("id") int id) {
		logger.info("GET /" + id + " [XML]");

		return prepareProviderResponse(id, false);
	}
