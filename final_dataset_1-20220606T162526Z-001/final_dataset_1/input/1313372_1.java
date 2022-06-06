public boolean isSpam() throws MessagingException {
    String[] spamFlags = this.mimeMessage.getHeader(SPAM_FLAG_HEADER);
    if (spamFlags != null) {
      for (String flag : spamFlags) {
        if ("YES".equalsIgnoreCase(flag)) {
          return true;
        }
      }
    }
    return false;
  }
