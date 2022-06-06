@Override
  public String generateName(CommandStartedEvent event) {
    final String operationName = event != null && event.getCommandName() != null ?
        event.getCommandName() : NO_OPERATION;
    return ((prefix == null) ? "" : prefix) + operationName;
  }
