@Override
  public void execute() throws CommitStepException {
    log.info(String.format("HelixParticipantCheck step called for Helix Instance: %s, Helix job: %s, Helix partition: %d",
        this.helixInstanceName, this.helixJob, this.partitionNum));

    //Query Helix to get the currently assigned participant for the Helix partitionNum
    Callable callable = () -> {
      JobContext jobContext;
      try {
        TaskDriver taskDriver = new TaskDriver(helixManager);
        jobContext = taskDriver.getJobContext(helixJob);
      } catch (Exception e) {
        log.info("Encountered exception when executing " + getClass().getSimpleName(), e);
        log.info("Refreshing Helix manager..");
        refreshHelixManager();
        //Rethrow the exception to trigger a retry.
        throw e;
      }

      if (jobContext != null) {
        String participant = jobContext.getAssignedParticipant(partitionNum);
        if (participant != null) {
          return participant.equalsIgnoreCase(helixInstanceName);
        }
      }
      return false;
    };

    boolean isParticipant;
    try {
      isParticipant = retryer.call(callable);
    } catch (ExecutionException | RetryException e) {
      log.error("Cannot complete participant assignment check within the retry limit due to: {}", e);
      //Set isParticipant to true; since we cannot verify the status of the Helix Participant at this time.
      isParticipant = true;
    }

    if (!isParticipant) {
      throw new CommitStepException(String.format("Helix instance %s not the assigned participant for partition %d",this.helixInstanceName, this.partitionNum));
    }
  }
