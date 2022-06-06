@PermitAll
	@GET
	@Path("/error")
	@Produces("application/json")
	public Response error() throws Exception {
		throw new BizException("TEST", "test exception");
	}
