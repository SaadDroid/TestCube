@Override
  public synchronized boolean triggerCycle() {
    s_logger.debug("Cycle triggered manually");
    _forceTriggerCycle = true;
    notifyAll();
    return true;
  }
