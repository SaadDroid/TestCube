@Override
    public void dispatchEvent(LogEvent logEvent) {
        try {
            // attempt to enqueue the log event for processing
            workerExecutor.execute(new EventDispatcher(logEvent));
        } catch (RejectedExecutionException e) {
            logger.error("event dispatch rejected");
        }
    }
