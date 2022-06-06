public List<Message> transform(List<MessageEntity> messageEntities) {
    List<Message> messages = new ArrayList<>(messageEntities.size());

    for (MessageEntity messageEntity : messageEntities) {
      if (messageEntity != null) {
        messages.add(transform(messageEntity));
      }
    }

    return messages;
  }
