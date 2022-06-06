public static Trigger createTrigger(JobRequest jobRequest) {
        String cronExpression = jobRequest.getCronExpression();
        LocalDateTime startDateAt = jobRequest.getStartDateAt();

        if (!StringUtils.isEmpty(cronExpression)) {
            if (!isValidExpression(cronExpression)) {
                throw new IllegalArgumentException("Provided expression " + cronExpression + " is not a valid cron expression");
            }
            return createCronTrigger(jobRequest);
        } else if (startDateAt != null) {
            return createSimpleTrigger(jobRequest);
        }
        throw new IllegalStateException("unsupported trigger descriptor");
    }
