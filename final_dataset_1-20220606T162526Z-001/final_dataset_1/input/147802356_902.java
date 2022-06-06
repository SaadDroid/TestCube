public synchronized void cancel() {
    futureDuties.cancel(false);
    pendingActions.clear();
  }
