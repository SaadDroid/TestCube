public String createProvider(String aggregatorId, String id, String name, String country, String countryCode, 
      String description, String nameCode, String homepage, ProviderType providerType, String email)
      throws InvalidArgumentsException, MissingArgumentsException, AlreadyExistsException,
      InternalServerErrorException, DoesNotExistException {
    WebTarget target =
        client.target(restUrl + "/" + ProviderOptionListContainer.PROVIDERS).queryParam(
            ProviderOptionListContainer.AGGREGATORID, aggregatorId);
    // dataProvider.setCountry("AUSTRIA");


    DataProvider provider =
        new DataProvider(id, name, null, description, null, nameCode, homepage,
            providerType, email);
    provider.setCountry(country);
    provider.setCountryCode(countryCode);
    Response response =
        target.request(MediaType.APPLICATION_JSON).post(
            Entity.entity(provider, MediaType.APPLICATION_JSON), Response.class);

    switch (response.getStatus()) {
      case 400:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("createProvider(..) failure! : " + errorMessage.getResult());
        throw new InvalidArgumentsException(errorMessage.getResult());
      case 404:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("createProvider(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 406:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("createProvider(..) failure! : " + errorMessage.getResult());
        throw new MissingArgumentsException(errorMessage.getResult());
      case 409:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("createProvider(..) failure! : " + errorMessage.getResult());
        throw new AlreadyExistsException(errorMessage.getResult(), errorMessage.getResult().substring(errorMessage.getResult().indexOf("<") + 1, errorMessage.getResult().indexOf(">")));
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("createProvider(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    LOGGER.info("createProvider(..) success!");
    Result result = response.readEntity(Result.class);
    return result.getResult().substring(result.getResult().indexOf("<") + 1, result.getResult().indexOf(">"));
  }
