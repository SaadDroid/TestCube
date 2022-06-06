@Override
    public void onLockAcquire(DistributedLock lock) {
        if (!terminated) {
            if (log.isInfoEnabled()) {
                log.info("Switching to leader state [group={}, candidate={}]", group, candidate);
            }

            followerCtx = null;

            leaderCtx = new DefaultLeaderContext();

            try {
                candidate.becomeLeader(leaderCtx);
            } finally {
                updateLeaderFuture(localNode);
            }
        }
    }
