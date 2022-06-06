@Override
  public SerializableMessage translate(AdaptrisMessage message) throws CoreException {
    SerializableAdaptrisMessage serializedMsg = new SerializableAdaptrisMessage();
    // It's a file message; arbitrarily too large?
    if (message instanceof FileBackedMessage && message.getSize() > DEFAULT_LMS_BOUNDARY) {
      serializedMsg.setContent(buildFileDetails(((FileBackedMessage) message).currentSource()));
    }
    else {
      serializedMsg.setContent(message.getContent());
    }
    serializedMsg.setUniqueId(message.getUniqueId());
    serializedMsg.setContentEncoding(message.getContentEncoding());
    serializedMsg.setMetadata(message.getMetadata());
    serializedMsg.setNextServiceId(message.getNextServiceId());
    
    // do we have a failed/error'd message?
    if(message.getObjectHeaders().containsKey(CoreConstants.OBJ_METADATA_EXCEPTION))
      serializedMsg.addMetadata(CoreConstants.OBJ_METADATA_EXCEPTION, ((Throwable) message.getObjectHeaders().get(CoreConstants.OBJ_METADATA_EXCEPTION)).getMessage());
      
    return serializedMsg;
  }
