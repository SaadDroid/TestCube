@Override
  public boolean requiresRestart() {
    boolean result = messagesProcessedCount >= this.getMaxMessagesCount();
    if(result)
      messagesProcessedCount = 0;
    return result;
  }
