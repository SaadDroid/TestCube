public void exportDataset(String id, String format) throws DoesNotExistException, AlreadyExistsException
  {
    WebTarget target = client.target(restUrl + "/" + DatasetOptionListContainer.DATASETS + "/" + id + "/" + DatasetOptionListContainer.EXPORT).queryParam(DatasetOptionListContainer.FORMAT, format);
    Response response = target.request(MediaType.APPLICATION_JSON).post(null, Response.class);
    
    switch (response.getStatus()) {
      case 404:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("exportDataset(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 409:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("exportDataset(..) failure! : " + errorMessage.getResult());
        throw new AlreadyExistsException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("exportDataset(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    LOGGER.info("exportDataset(..) success!");
  }
