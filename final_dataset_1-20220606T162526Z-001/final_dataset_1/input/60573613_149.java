public void failoverIfNecessary() {
        if (!needFailover()) {
            return;
        }
        jobNodeStorage.executeInLeader(FailoverNode.LATCH, new FailoverLeaderExecutionCallback());
    }
