public void updateAggregator(String id, String newId, String name, String nameCode,
      String homepage) throws InvalidArgumentsException, MissingArgumentsException,
      DoesNotExistException, InternalServerErrorException {
    WebTarget target =
        client.target(restUrl + "/" + AggregatorOptionListContainer.AGGREGATORS + "/" + id);
    Aggregator aggregator = new Aggregator(newId, name, nameCode, homepage, null);
    Response response =
        target.request(MediaType.APPLICATION_JSON).put(
            Entity.entity(aggregator, MediaType.APPLICATION_JSON), Response.class);

    switch (response.getStatus()) {
      case 400:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateAggregator(..) failure! : " + errorMessage.getResult());
        throw new InvalidArgumentsException(errorMessage.getResult());
      case 404:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateAggregator(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 406:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateAggregator(..) failure! : " + errorMessage.getResult());
        throw new MissingArgumentsException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateAggregator(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    LOGGER.info("updateAggregator(..) success!");
  }
