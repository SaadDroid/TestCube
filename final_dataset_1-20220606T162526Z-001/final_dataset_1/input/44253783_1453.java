@Override
  public void doService(AdaptrisMessage msg) throws ServiceException {
    try {
      this.produce(msg);
    }
    catch (ProduceException e) {
      throw new ServiceException(e);
    }
  }
