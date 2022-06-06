public boolean hasRunningItems(final List<Integer> items) {
        if (!configService.isMonitorExecution()) {
            return false;
        }
        for (int each : items) {
            if (jobNodeStorage.isJobNodeExisted(ExecutionNode.getRunningNode(each))) {
                return true;
            }
        }
        return false;
    }
