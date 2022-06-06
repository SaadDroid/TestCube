@Override
  public Destination getValueFromMessage(AdaptrisMessage msg) throws CoreException {
    if (msg.getObjectHeaders().containsKey(JmsConstants.OBJ_JMS_REPLY_TO_KEY)) {
      return (Destination) msg.getObjectHeaders().get(JmsConstants.OBJ_JMS_REPLY_TO_KEY);
    }
    return null;
  }
