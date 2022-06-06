public String getDatasetHarvestingStatus(String id) throws DoesNotExistException,
      InternalServerErrorException {
    WebTarget target =
        client.target(restUrl + "/" + DatasetOptionListContainer.DATASETS + "/" + id + "/"
            + HarvestOptionListContainer.HARVEST + "/" + HarvestOptionListContainer.STATUS);
    Response response = target.request(MediaType.APPLICATION_JSON).get();

    switch (response.getStatus()) {
      case 404:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("getDatasetHarvestingStatus(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("getDatasetHarvestingStatus(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    Result result = response.readEntity(Result.class);
    LOGGER.info("getDatasetHarvestingStatus(..) success!");
    return result.getResult();
  }
