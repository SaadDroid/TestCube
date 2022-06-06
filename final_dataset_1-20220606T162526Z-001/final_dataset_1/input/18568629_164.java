@OPTIONS
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @ApiOperation(value = "Get options over aggregator conext.", httpMethod = "OPTIONS", response = AggregatorOptionListContainer.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK (Response containing a list of all available options)")
    })
    public AggregatorOptionListContainer getOptions() {
        AggregatorOptionListContainer aggregatorOptionListContainer = new AggregatorOptionListContainer(uriInfo.getBaseUri());
        return aggregatorOptionListContainer;
    }
