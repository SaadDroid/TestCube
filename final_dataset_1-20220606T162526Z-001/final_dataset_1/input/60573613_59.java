public void init() {
        log.debug("Elastic job: job controller init, job name is: {}.", jobName);
        schedulerFacade.clearPreviousServerStatus();
        regCenter.addCacheData("/" + jobName);
        schedulerFacade.registerStartUpInfo();
        jobDetail.getJobDataMap().put("jobFacade", jobFacade);
        JobScheduleController jobScheduleController;
        try {
            jobScheduleController = new JobScheduleController(
                    initializeScheduler(jobDetail.getKey().toString()), jobDetail, schedulerFacade, Joiner.on("_").join(jobName, CRON_TRIGGER_IDENTITY_SUFFIX));
            jobScheduleController.scheduleJob(schedulerFacade.getCron());
        } catch (final SchedulerException ex) {
            throw new JobException(ex);
        }
        JobRegistry.getInstance().addJobScheduleController(jobName, jobScheduleController);
    }
