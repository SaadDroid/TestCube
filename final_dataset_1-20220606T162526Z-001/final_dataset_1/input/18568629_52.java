public List<ScheduledTask> getDatasetScheduledTasks(String id) throws DoesNotExistException,
      InternalServerErrorException {
    WebTarget target =
        client.target(restUrl + "/" + DatasetOptionListContainer.DATASETS + "/" + id + "/"
            + HarvestOptionListContainer.HARVEST + "/" + HarvestOptionListContainer.SCHEDULES);
    Response response = target.request(MediaType.APPLICATION_JSON).get();

    switch (response.getStatus()) {
      case 404:
        Result errorMessage = response.readEntity(Result.class);
        LOGGER.warn("getDatasetScheduledTasks(..) failure! : " + errorMessage.getResult());
        throw new DoesNotExistException(errorMessage.getResult());
      case 500:
        errorMessage = response.readEntity(Result.class);
        LOGGER.warn("getDatasetScheduledTasks(..) failure! : " + errorMessage.getResult());
        throw new InternalServerErrorException(errorMessage.getResult());
    }
    List<ScheduledTask> scheduleTasksList =
        response.readEntity(new GenericType<List<ScheduledTask>>() {});
    LOGGER.info("getDatasetScheduledTasks(..) success!");
    return scheduleTasksList;
  }
