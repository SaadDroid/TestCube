public void delete(T... states) {
    if (states == null) {
      return;
    }
    if (isWithinTransaction()) {
      for (T state : states) {
        this.txService.delete(getTxElement(state));
      }
    }
    else {
      this.writeDao.delete(states);
    }
  }
