@Override
  public void nack(Throwable error) {
    for (Ackable ackable : _callbacks) {
      ackable.nack(error);
    }
  }
