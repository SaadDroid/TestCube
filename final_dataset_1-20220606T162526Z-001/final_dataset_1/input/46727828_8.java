@Override
  protected void process(LogRecord record) {
    Mutation event = getEventMutation(record);
    try {
      eventWriter.addMutation(event);
    } catch (MutationsRejectedException e) {
      logger.error("Failed to store row. Reseting Writer", e);
      resetEventWriter();
      throw new FailedException(e);
    }
  }
