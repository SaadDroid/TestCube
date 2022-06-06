public static String condenseThrowableMessage(Throwable t) {
    StringBuilder condensedMessageBuilder = new StringBuilder();
    condensedMessageBuilder.append(t.getMessage());
    Throwable current = t.getCause();
    while (current != null) {
      String currMessage = current.getMessage();
      // Ignore null and empty message strings caused by Java runtime
      if (currMessage != null && currMessage.length() != 0) {
        condensedMessageBuilder.append(CONDENSE_COMBINER_STRING);
        condensedMessageBuilder.append(currMessage);
      }
      current = current.getCause();
    }
    return condensedMessageBuilder.toString();
  }
