public void start() {
    synchronized (this) {
      if (_state != State.NOT_STARTED) {
        s_logger.error("Already started executing {}", this);
        throw new IllegalStateException(_state.toString());
      }
      _state = State.EXECUTING;
      _startTime = System.nanoTime();
    }
    if (getGraph().isFinished()) {
      s_logger.info("Execution plan {} is empty", this);
      notifyComplete();
    } else {
      s_logger.info("Starting executing {}", this);
      submitExecutableJobs();
    }
  }
