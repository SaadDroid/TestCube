@Override
    public void onLockBusy(LockOwnerInfo owner) {
        if (!terminated) {
            ClusterNode leader = owner.node();

            if (log.isInfoEnabled()) {
                log.info("Switching to follower state [group={}, leader={}, candidate={}]", group, leader, candidate);
            }

            disposeLeader();

            followerCtx = new DefaultFollowerContext(leader);

            try {
                candidate.becomeFollower(followerCtx);
            } finally {
                updateLeaderFuture(leader);
            }
        }
    }
