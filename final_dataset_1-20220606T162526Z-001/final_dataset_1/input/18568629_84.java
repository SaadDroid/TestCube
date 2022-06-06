public void deleteMapping(String id) throws DoesNotExistException, InternalServerErrorException {
    WebTarget target =
        client.target(restUrl + "/" + MappingOptionListContainer.MAPPINGS + "/" + id);
    Response response = target.request(MediaType.APPLICATION_JSON).delete();
    if (response.getStatus() == 404) {
      Result errorMessage = response.readEntity(Result.class);
      LOGGER.warn("deleteMapping(..) failure! : " + errorMessage.getResult());
      throw new DoesNotExistException(errorMessage.getResult());
    } else if (response.getStatus() == 500) {
      Result errorMessage = response.readEntity(Result.class);
      LOGGER.warn("deleteMapping(..) failure! : " + errorMessage.getResult());
      throw new InternalServerErrorException(errorMessage.getResult());
    }
    LOGGER.info("deleteMapping(..) success!");
  }
