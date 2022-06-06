public void startHarvest(String id, String type) throws AlreadyExistsException,
      DoesNotExistException, InternalServerErrorException {
    WebTarget target =
        client.target(
            restUrl + "/" + DatasetOptionListContainer.DATASETS + "/" + id + "/"
                + HarvestOptionListContainer.HARVEST + "/" + HarvestOptionListContainer.START)
            .queryParam(HarvestOptionListContainer.TYPE, type);
    Response response =
        target.request(MediaType.APPLICATION_JSON).post(
            Entity.entity(null, MediaType.APPLICATION_JSON), Response.class);

    switch (response.getStatus()) {
      case 404:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("startHarvest(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 409:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("startHarvest(..) failure! : " + errorMessage.getResult());
        throw new AlreadyExistsException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("startHarvest(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    Result errorMessage = response.readEntity(Result.class);
    LOGGER.info("startHarvest(..) success! : " + errorMessage.getResult());
  }
