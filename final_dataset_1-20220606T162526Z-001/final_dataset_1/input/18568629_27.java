public String getDatasetLastIngestionDate(String id) throws DoesNotExistException,
      InternalServerErrorException {
    WebTarget target =
        client.target(restUrl + "/" + DatasetOptionListContainer.DATASETS + "/" + id + "/" + DatasetOptionListContainer.DATE);
    Response response = target.request(MediaType.APPLICATION_JSON).get();

    switch (response.getStatus()) {
      case 404:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("getDatasetLastIngestionDate(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("getDatasetLastIngestionDate(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    LOGGER.info("getDatasetLastIngestionDate(..) success!");
    Result result = response.readEntity(Result.class);
    return result.getResult();
  }
