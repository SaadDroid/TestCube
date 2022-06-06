public void update(T... states) {
    if (states == null) {
      return;
    }
    if (isWithinTransaction()) {
      for (T state : states) {
        this.txService.update(getTxElement(state));
      }
    }
    else {
      this.writeDao.update(states);
    }
  }
