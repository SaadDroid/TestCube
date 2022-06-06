@Override
  public SafeFuture<ValidationResult> apply(final MessageApi message) {
    final int messageSize = message.getData().readableBytes();
    if (messageSize > GOSSIP_MAX_SIZE) {
      LOG.trace(
          "Rejecting gossip message of length {} which exceeds maximum size of {}",
          messageSize,
          GOSSIP_MAX_SIZE);
      return VALIDATION_FAILED;
    }
    byte[] arr = new byte[message.getData().readableBytes()];
    message.getData().slice().readBytes(arr);
    Bytes bytes = Bytes.wrap(arr);
    if (!processedMessages.add(bytes)) {
      // We've already seen this message, skip processing
      LOG.trace("Ignoring duplicate message for topic {}: {} bytes", topic, bytes.size());
      return VALIDATION_IGNORED;
    }
    LOG.trace("Received message for topic {}: {} bytes", topic, bytes.size());

    return handler.handleMessage(bytes);
  }
