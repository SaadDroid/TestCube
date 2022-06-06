public void start() {
    worker = new Thread(null, this, "SplitLogWorker-" + serverName);
    exitWorker = false;
    worker.start();
  }
