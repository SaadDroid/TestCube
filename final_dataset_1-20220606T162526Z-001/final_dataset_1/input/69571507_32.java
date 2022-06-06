private void handleSendMessageRequest(SendMessageRequest request) {
    injectPerMessage(request.getQueueUrl(), request.getMessageAttributes());
  }
