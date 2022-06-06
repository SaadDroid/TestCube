public void run()
      throws IOException, InterruptedException {
    if (!this.workUnits.hasNext()) {
      log.warn("No work units to run in container " + containerIdOptional.or(""));
      return;
    }

    CountUpAndDownLatch countDownLatch = new CountUpAndDownLatch(0);
    Pair<List<Task>, Boolean> executionResult = runWorkUnits(countDownLatch);
    this.tasks = executionResult.getFirst();

    // Indicating task submission failure, propagating exception as it should be noticeable to job launcher.
    // Submission failure could be task-creation failure, or state-tracker failed to be scheduled so that the actual
    // task isn't submitted into the executor.
    if (!executionResult.getSecond()) {
      throw new TaskCreationException("Failing in submitting at least one task before execution.");
    }

    log.info("Waiting for submitted tasks of job {} to complete in container {}...", jobId, containerIdOptional.or(""));
    try {
      while (countDownLatch.getCount() > 0) {
        if (this.interruptionPredicate.test(this)) {
          log.info("Interrupting task execution due to satisfied predicate.");
          interruptTaskExecution(countDownLatch);
          break;
        }
        log.info(String.format("%d out of %d tasks of job %s are running in container %s", countDownLatch.getCount(),
            countDownLatch.getRegisteredParties(), jobId, containerIdOptional.or("")));
        if (countDownLatch.await(10, TimeUnit.SECONDS)) {
          break;
        }
      }
    } catch (InterruptedException interrupt) {
      log.info("Job interrupted by InterrupedException.");
      interruptTaskExecution(countDownLatch);
    }
    log.info("All assigned tasks of job {} have completed in container {}", jobId, containerIdOptional.or(""));
  }
