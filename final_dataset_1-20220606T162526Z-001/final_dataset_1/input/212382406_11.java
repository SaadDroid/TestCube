@Override
  public void registerTask(ReconOmTask task) {
    String taskName = task.getTaskName();
    LOG.info("Registered task {} with controller.", taskName);

    // Store task in Task Map.
    reconOmTasks.put(taskName, task);
    // Store Task in Task failure tracker.
    taskFailureCounter.put(taskName, new AtomicInteger(0));
    // Create DB record for the task.
    ReconTaskStatus reconTaskStatusRecord = new ReconTaskStatus(taskName,
        0L, 0L);
    if (!reconTaskStatusDao.existsById(taskName)) {
      reconTaskStatusDao.insert(reconTaskStatusRecord);
    }
  }
