@Override
    public Result execute() {
        FormattingResultLog resultLog = new FormattingResultLog();

        if(agentManager.getAgents().isEmpty()) {
            resultLog.info("No agents configured");
        }

        for (Map.Entry<String, Agent> entry : agentManager.getAgents().entrySet()) {
            Agent agent = entry.getValue();

            // only perform check against valid/enabled agent
            if(agent.isValid() && agent.isEnabled()) {
                ReplicationQueue replicationQueue = agent.getQueue();
                if(!replicationQueue.entries().isEmpty()) {
                    ReplicationQueue.Entry firstEntry = replicationQueue.entries().get(0);
                    if(firstEntry.getNumProcessed() > MAX_REPLICATION_TRIES) {
                        resultLog.warn("Agent [{}] number of retries: {}, expected number of retries <= {}", agent.getId(), firstEntry.getNumProcessed(), MAX_REPLICATION_TRIES);
                    }
                } else {
                    resultLog.debug("Agent [{}] replication queue {} is empty.", replicationQueue.getName());
                }
            } else {
                resultLog.debug("Agent [{}] is not valid and/or not enabled.");
            }
        }
        return new Result(resultLog);
    }