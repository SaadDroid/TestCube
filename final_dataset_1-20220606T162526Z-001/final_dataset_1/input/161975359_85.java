@Override
    public boolean updateJob(JobRequest jobRequest) {
        JobKey jobKey = null;
        Trigger newTrigger;

        try {
            newTrigger = JobUtils.createTrigger(jobRequest);
            jobKey = JobKey.jobKey(jobRequest.getJobName(), jobRequest.getJobGroup());

            jobHistoryService.updateJob(jobKey);

            Date dt = schedulerFactoryBean.getScheduler().rescheduleJob(TriggerKey.triggerKey(jobRequest.getJobName()), newTrigger);
            log.debug("Job with jobKey : {} rescheduled successfully at date : {}", jobKey, dt);
            return true;
        } catch (SchedulerException e) {
            log.error("error occurred while scheduling with jobKey : {}", jobKey, e);
        }
        return false;
    }
