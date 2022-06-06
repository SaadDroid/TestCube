@Override
    public MessageList getMessages(MessageList messageList) {
        Object boundObject = getBoundObject();
        if (boundObject == null) {
            return new MessageList();
        } else {
            MessageList msgListForBoundObject = messageList.getMessagesFor(boundObject, getProperty());
            msgListForBoundObject.add(fallbackDispatcher.getMessages(messageList));
            // TODO may additionally call a method like "get<Property>NlsText()"
            return msgListForBoundObject;
        }
    }
