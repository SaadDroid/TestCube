public void triggerJob() {
        try {
            if (!scheduler.isShutdown()) {
                scheduler.triggerJob(jobDetail.getKey());
            }
        } catch (final SchedulerException ex) {
            throw new JobException(ex);
        }
    }
