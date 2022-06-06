protected boolean isNotification(String contentType) {
    return isDeliveryStatus(contentType) || isMessageReport(contentType);
  }
