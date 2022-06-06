public Boolean isLeader() {
        String localHostIp = localHostService.getIp();
        while (!hasLeader() && !serverService.getAvailableServers().isEmpty()) {
            log.info("Elastic job: leader node is electing, waiting for 100 ms at server '{}'", localHostIp);
            BlockUtils.waitingShortTime();
        }
        return localHostIp.equals(jobNodeStorage.getJobNodeData(ElectionNode.LEADER_HOST));
    }
