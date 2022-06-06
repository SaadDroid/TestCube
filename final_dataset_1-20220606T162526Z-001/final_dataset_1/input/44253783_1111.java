@Override
  public void forceClose() throws CoreException {
    sendNotification(createLifecycleNotification(NOTIF_MSG_FORCE_CLOSE, myObjectName));
    log.trace("Force Close on {}", myObjectName);
    // TODO : This is probably quite bad, but once we move to having our own class loader each adapter should have
    // their own static instance of MTF so we aren't interrupting all threads globally...
    ManagedThreadFactory.interruptManagedThreads();
    super.requestClose();
  }
