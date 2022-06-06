@Override
    public List<String> getChildren(final String path, final Watcher watcher, final Stat stat)
            throws KeeperException, InterruptedException {
        return ZooWorker.syncCallWithRetries(this, new ZooCallable<List<String>>() {

            @Override
            public List<String> call() throws KeeperException, InterruptedException {
                ZooKeeper zkHandle = zk.get();
                if (null == zkHandle) {
                    return ZooKeeperClient.super.getChildren(path, watcher, stat);
                }
                return zkHandle.getChildren(path, watcher, stat);
            }

            @Override
            public String toString() {
                return String.format("getChildren (%s, watcher = %s)", path, watcher);
            }

        }, operationRetryPolicy, rateLimiter, getChildrenStats);
    }
