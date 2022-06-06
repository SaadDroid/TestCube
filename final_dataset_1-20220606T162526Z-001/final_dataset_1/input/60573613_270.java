public void registerJobBegin(final JobExecutionMultipleShardingContext jobExecutionShardingContext) {
        if (!jobExecutionShardingContext.getShardingItems().isEmpty() && configService.isMonitorExecution()) {
            serverService.updateServerStatus(ServerStatus.RUNNING);
            for (int each : jobExecutionShardingContext.getShardingItems()) {
                jobNodeStorage.fillEphemeralJobNode(ExecutionNode.getRunningNode(each), "");
                jobNodeStorage.replaceJobNode(ExecutionNode.getLastBeginTimeNode(each), System.currentTimeMillis());
                JobScheduleController jobScheduleController = JobRegistry.getInstance().getJobScheduleController(jobConfiguration.getJobName());
                if (null == jobScheduleController) {
                    continue;
                }
                Date nextFireTime = jobScheduleController.getNextFireTime();
                if (null != nextFireTime) {
                    jobNodeStorage.replaceJobNode(ExecutionNode.getNextFireTimeNode(each), nextFireTime.getTime());
                }
            }
        }
    }
