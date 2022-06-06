@Override
    public synchronized void updateClusterAssignmentData(ClusterAssignmentData assignmentData) {
        this.assignmentData = assignmentData;
        watchers.values().forEach(wae -> wae.executor.execute(() -> wae.watcher.accept(null)));
    }
