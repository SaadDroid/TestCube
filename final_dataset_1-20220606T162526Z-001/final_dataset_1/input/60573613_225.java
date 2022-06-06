public void addDataListener(final TreeCacheListener listener) {
        TreeCache cache = (TreeCache) coordinatorRegistryCenter.getRawCache("/" + jobConfiguration.getJobName());
        cache.getListenable().addListener(listener);
    }
