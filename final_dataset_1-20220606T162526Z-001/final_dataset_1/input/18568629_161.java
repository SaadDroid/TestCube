@OPTIONS
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@ApiOperation(value = "Get options over statistics conext.", httpMethod = "OPTIONS", response = StatisticsOptionListContainer.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK (Response containing a list of all available options)") })
	public StatisticsOptionListContainer getOptions() {
		StatisticsOptionListContainer statisticsOptionListContainer = new StatisticsOptionListContainer(
				uriInfo.getBaseUri());
		return statisticsOptionListContainer;
	}
