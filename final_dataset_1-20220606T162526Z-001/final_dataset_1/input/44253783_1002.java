@Override
  public void registerAdaptrisMessageListener(AdaptrisMessageListener l) {
    getConsumer().registerAdaptrisMessageListener(l);
  }
