public void copyDataset(String id, String newId) throws InvalidArgumentsException,
      DoesNotExistException, MissingArgumentsException, AlreadyExistsException {
    WebTarget target =
        client.target(restUrl + "/" + DatasetOptionListContainer.DATASETS + "/" + id).queryParam(
            "newDatasetId", newId);
    Response response =
        target.request(MediaType.APPLICATION_JSON).post(
            Entity.entity(null, MediaType.APPLICATION_JSON), Response.class);

    switch (response.getStatus()) {
      case 400:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("copyDataset(..) failure! : " + errorMessage.getResult());
        throw new InvalidArgumentsException(errorMessage.getResult());
      case 404:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("copyDataset(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 406:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("copyDataset(..) failure! : " + errorMessage.getResult());
        throw new MissingArgumentsException(errorMessage.getResult());
      case 409:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("copyDataset(..) failure! : " + errorMessage.getResult());
        throw new AlreadyExistsException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("copyDataset(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    LOGGER.info("copyDataset(..) success!");
  }
