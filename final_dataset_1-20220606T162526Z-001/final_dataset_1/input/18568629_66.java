public List<DataProvider> getProviderList(String aggregatorId, int offset, int number)
      throws InvalidArgumentsException, DoesNotExistException {
    WebTarget target =
        client.target(restUrl + "/" + ProviderOptionListContainer.PROVIDERS)
            .queryParam(ProviderOptionListContainer.AGGREGATORID, aggregatorId)
            .queryParam(ProviderOptionListContainer.OFFSET, offset)
            .queryParam(ProviderOptionListContainer.NUMBER, number);
    Response response = target.request(MediaType.APPLICATION_JSON).get();
    if (response.getStatus() == 400) {
      Result errorMessage = response.readEntity(Result.class);
      LOGGER.warn("getProviderList(..) failure! : " + errorMessage.getResult());
      throw new InvalidArgumentsException(errorMessage.getResult());
    }
    else if (response.getStatus() == 404) {
      Result errorMessage = response.readEntity(Result.class);
      LOGGER.warn("getProviderList(..) failure! : " + errorMessage.getResult());
      throw new DoesNotExistException(errorMessage.getResult());
    }
    List<DataProvider> subList = response.readEntity(new GenericType<List<DataProvider>>() {});
    LOGGER.info("getProviderList(..) success!");

    return subList;
  }
