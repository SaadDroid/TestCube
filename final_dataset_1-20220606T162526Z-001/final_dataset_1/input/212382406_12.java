@Override
  public synchronized void consumeOMEvents(OMUpdateEventBatch events,
                              OMMetadataManager omMetadataManager)
      throws InterruptedException {

    try {
      if (!events.isEmpty()) {
        Collection<Callable<Pair<String, Boolean>>> tasks = new ArrayList<>();
        for (Map.Entry<String, ReconOmTask> taskEntry :
            reconOmTasks.entrySet()) {
          ReconOmTask task = taskEntry.getValue();
          Collection<String> tables = task.getTaskTables();
          tasks.add(() -> task.process(events.filter(tables)));
        }

        List<Future<Pair<String, Boolean>>> results =
            executorService.invokeAll(tasks);
        List<String> failedTasks = processTaskResults(results, events);

        // Retry
        List<String> retryFailedTasks = new ArrayList<>();
        if (!failedTasks.isEmpty()) {
          tasks.clear();
          for (String taskName : failedTasks) {
            ReconOmTask task = reconOmTasks.get(taskName);
            Collection<String> tables = task.getTaskTables();
            tasks.add(() -> task.process(events.filter(tables)));
          }
          results = executorService.invokeAll(tasks);
          retryFailedTasks = processTaskResults(results, events);
        }

        // Reprocess the failed tasks.
        if (!retryFailedTasks.isEmpty()) {
          tasks.clear();
          for (String taskName : failedTasks) {
            ReconOmTask task = reconOmTasks.get(taskName);
            tasks.add(() -> task.reprocess(omMetadataManager));
          }
          results = executorService.invokeAll(tasks);
          List<String> reprocessFailedTasks =
              processTaskResults(results, events);
          ignoreFailedTasks(reprocessFailedTasks);
        }
      }
    } catch (ExecutionException e) {
      LOG.error("Unexpected error : ", e);
    }
  }
