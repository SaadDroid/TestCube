public void updateMapping(String id, MetadataTransformation metadataTransformation, File file)
      throws InvalidArgumentsException, DoesNotExistException, MissingArgumentsException,
      AlreadyExistsException, InternalServerErrorException {
    WebTarget target = client.register(MultiPartFeature.class).target(restUrl + "/" + MappingOptionListContainer.MAPPINGS + "/" + id);

    // MediaType of the body part will be derived from the file.
    final FileDataBodyPart filePart =
        new FileDataBodyPart(file.getName(), file, MediaType.APPLICATION_OCTET_STREAM_TYPE);
    MultiPart multiPartEntity = new MultiPart();
    multiPartEntity.bodyPart(new BodyPart(metadataTransformation, MediaType.APPLICATION_XML_TYPE));
    multiPartEntity.bodyPart(filePart);

    Response response =
        target.request().put(Entity.entity(multiPartEntity, new MediaType("multipart", "mixed")),
            Response.class);

    switch (response.getStatus()) {
      case 400:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateMapping(..) failure! : " + errorMessage.getResult());
        throw new InvalidArgumentsException(errorMessage.getResult());
      case 404:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateMapping(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 406:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateMapping(..) failure! : " + errorMessage.getResult());
        throw new MissingArgumentsException(errorMessage.getResult());
      case 409:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateMapping(..) failure! : " + errorMessage.getResult());
        throw new AlreadyExistsException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("updateMapping(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    LOGGER.info("updateMapping(..) success!");
  }
