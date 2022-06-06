public void run()
      throws IOException, InterruptedException {

    // Add dynamic configuration to the job state
    _dynamicConfig.entrySet().forEach(e -> _jobState.setProp(e.getKey(), e.getValue().unwrapped().toString()));

    Config jobConfig = getConfigFromJobState(_jobState);

    _logger.debug("SingleTask.run: jobId {} workUnitFilePath {} jobStateFilePath {} jobState {} jobConfig {}",
        _jobId, _workUnitFilePath, _jobStateFilePath, _jobState, jobConfig);

    try (SharedResourcesBroker<GobblinScopeTypes> globalBroker = SharedResourcesBrokerFactory
        .createDefaultTopLevelBroker(jobConfig, GobblinScopeTypes.GLOBAL.defaultScopeInstance())) {
      SharedResourcesBroker<GobblinScopeTypes> jobBroker = getJobBroker(_jobState, globalBroker);

      // Secure atomicity of taskAttempt's execution.
      // Signaling blocking threads if any whenever taskAttempt is nonNull.
      _taskAttempt = _taskAttemptBuilder.build(getWorkUnits().iterator(), _jobId, _jobState, jobBroker);

      _lock.lock();
      try {
        _taskAttemptBuilt.signal();
      } finally {
        _lock.unlock();
      }

      // This is a blocking call.
      _taskAttempt.runAndOptionallyCommitTaskAttempt(GobblinMultiTaskAttempt.CommitPolicy.IMMEDIATE);

    } finally {
      _logger.info("Clearing all metrics object in cache.");
      _taskAttempt.cleanMetrics();
    }
  }
