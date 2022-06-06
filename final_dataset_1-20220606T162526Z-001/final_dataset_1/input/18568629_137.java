@OPTIONS
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  @ApiOperation(value = "Get options over providers conext.", httpMethod = "OPTIONS",
      response = ProviderOptionListContainer.class)
  @ApiResponses(value = {@ApiResponse(code = 200,
      message = "OK (Response containing a list of all available options)")})
  public ProviderOptionListContainer getOptions() {
    ProviderOptionListContainer providerOptionListContainer =
        new ProviderOptionListContainer(uriInfo.getBaseUri());
    return providerOptionListContainer;
  }
