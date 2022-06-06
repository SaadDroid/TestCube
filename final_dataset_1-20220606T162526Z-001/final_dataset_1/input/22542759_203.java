@Override
  public void run() throws Exception {
    MessagingServiceUtils.getSystemTopics(cConf, false);
    LOG.info("Messaging System configurations verified.");
  }
