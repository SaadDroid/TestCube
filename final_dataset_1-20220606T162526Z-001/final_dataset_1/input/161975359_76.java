@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
		if (jobDataMap.size() > 0 && !isJobInterrupted) {
			int jobId = jobDataMap.getInt("jobId");
			JobKey jobKey = context.getJobDetail().getKey();

			currThread = Thread.currentThread();
			log.info("============================================================================");
			log.info("CronJob started :: sleep : {} jobId : {} jobKey : {} - {}", MAX_SLEEP_IN_SECONDS, jobId, jobKey, currThread.getName());

			IntStream.range(0, 3).forEach(i -> {
				log.info("CronJob Counting - {}", i);
				try {
					TimeUnit.SECONDS.sleep(MAX_SLEEP_IN_SECONDS);
				} catch (InterruptedException e) {
					log.error(e.getMessage(), e);
				}
			});
			log.info("CronJob ended :: jobKey : {} - {}", jobKey, currThread.getName());
			log.info("============================================================================");
		}
	}
