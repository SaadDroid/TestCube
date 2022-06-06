@Override
    public void stop() {
        if (!HAConfiguration.isHAEnabled(configuration)) {
            LOG.info("HA is not enabled, no need to stop leader election service");
            return;
        }
        try {
            leaderLatch.close();
            curatorFactory.close();
        } catch (IOException e) {
            LOG.error("Error closing leader latch", e);
        }
    }
