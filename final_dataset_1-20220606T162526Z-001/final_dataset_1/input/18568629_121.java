public void removeRecord(String id, String type) throws MissingArgumentsException, DoesNotExistException, InternalServerErrorException
  {
    WebTarget target = client.target(restUrl + "/" + RecordOptionListContainer.RECORDS).queryParam("recordId", id).queryParam("type", type);
    Response response = target.request(MediaType.APPLICATION_JSON).delete();
    
    switch (response.getStatus()) {
      case 404:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("removeRecord(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 406:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("removeRecord(..) failure! : " + errorMessage.getResult());
        throw new MissingArgumentsException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("removeRecord(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    Result result = response.readEntity(Result.class);
    LOGGER.info("removeRecord(..) success! : " + result.getResult());
  }
