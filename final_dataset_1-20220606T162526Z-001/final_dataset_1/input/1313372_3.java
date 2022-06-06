public boolean isBounced() throws IOException, MessagingException {
    if (isAutomaticMessage()) {
      return true;
    }
    if (mimeMessage.getContent() instanceof Multipart) {
      Multipart parts = (Multipart) this.mimeMessage.getContent();
      for (int i = 0; i < parts.getCount(); i++) {
        String contentType = parts.getBodyPart(i).getContentType();
        if (isNotification(contentType)) {
          return true;
        }
      }
    }
    return isNotification(this.mimeMessage.getContentType());
  }
