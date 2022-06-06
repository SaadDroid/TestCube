public List<MessageModel> transform(List<Message> messages) {
    List<MessageModel> messageModels = new ArrayList<>();

    for (Message message : messages) {
      if (message != null) {
        messageModels.add(transform(message));
      }
    }

    return messageModels;
  }
