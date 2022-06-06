@SuppressWarnings("unchecked")
  public <T extends JmsProducer> T withEndpoint(String s) {
    setEndpoint(s);
    return (T) this;
  }
