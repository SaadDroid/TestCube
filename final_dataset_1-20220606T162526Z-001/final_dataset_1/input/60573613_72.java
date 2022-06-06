public void shutdown() {
        schedulerFacade.releaseJobResource();
        try {
            if (!scheduler.isShutdown()) {
                scheduler.shutdown();
            }
        } catch (final SchedulerException ex) {
            throw new JobException(ex);
        }
    }
