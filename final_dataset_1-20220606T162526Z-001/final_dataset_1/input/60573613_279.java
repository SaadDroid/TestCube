public void cleanPreviousExecutionInfo() {
        if (!jobNodeStorage.isJobNodeExisted(ExecutionNode.ROOT)) {
            return;
        }
        if (leaderElectionService.isLeader()) {
            jobNodeStorage.fillEphemeralJobNode(ExecutionNode.CLEANING, "");
            List<Integer> items = getAllItems();
            for (int each : items) {
                jobNodeStorage.removeJobNodeIfExisted(ExecutionNode.getCompletedNode(each));
            }
            if (jobNodeStorage.isJobNodeExisted(ExecutionNode.NECESSARY)) {
                fixExecutionInfo(items);
            }
            jobNodeStorage.removeJobNodeIfExisted(ExecutionNode.CLEANING);
        }
        while (jobNodeStorage.isJobNodeExisted(ExecutionNode.CLEANING)) {
            BlockUtils.waitingShortTime();
        }
    }
