protected AdaptrisMessage mergeReply(AdaptrisMessage reply, AdaptrisMessage msg)
      throws ProduceException {
    if (reply == msg) {
      return msg;
    }
    copyReplyContents(reply, msg);
    if (!shouldIgnoreReplyMetadata()) {
      reply.getMetadata().forEach((e) -> msg.addMetadata(e));
      msg.getObjectHeaders().putAll(reply.getObjectHeaders());
    }
    Optional.ofNullable(reply.getContentEncoding()).ifPresent((s) -> msg.setContentEncoding(s));
    return msg;
  }
