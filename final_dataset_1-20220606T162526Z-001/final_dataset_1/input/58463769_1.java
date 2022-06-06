@Override
    public void execute() {
        JiraClient.Response response = jiraClient.requestIssueStatus(address, issues);
        if (!response.ok()) {
            logger.warn("Requesting statuses for issues {} failed: {}", issues, response.errorDetails());
            newPollIn(60);
        } else if (positiveTargetStatus != null) {
            Map<String, String> issueStatuses = response.issueStatuses();
            if (!issueStatuses.entrySet().stream().map(Map.Entry::getValue).allMatch(status -> status.equals(positiveTargetStatus))) {
                logger.info("Statuses for issues {} are not yet {} (they are {}) [{} ms]", issues, positiveTargetStatus, issueStatuses, response.requestDuration());
                newPollIn(10);
            } else {
                logger.info("Success - statuses for issues {} are now {} [{} ms]", issues, issueStatuses, response.requestDuration());
                newCallbackJob();
            }
        } else if (negativeTargetStatus != null) {
            Map<String, String> issueStatuses = response.issueStatuses();
            if (issueStatuses.entrySet().stream().map(Map.Entry::getValue).anyMatch(status -> status.equals(negativeTargetStatus))) {
                logger.info("Statuses for issues {} are still {}) [{} ms]", issues, negativeTargetStatus, response.requestDuration());
                newPollIn(10);
            } else {
                logger.info("Success - statuses for issues {} are now not {} (they are {}) [{} ms]", issues, negativeTargetStatus, issueStatuses, response.requestDuration());
                newCallbackJob();
            }
        } else {
            throw new IllegalStateException("No target status defined");
        }
    }
