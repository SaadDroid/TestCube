@PostConstruct
    public void runSetup() throws SetupException {
        HAConfiguration.ZookeeperProperties zookeeperProperties = HAConfiguration.getZookeeperProperties(configuration);
        InterProcessMutex lock = curatorFactory.lockInstance(zookeeperProperties.getZkRoot());
        try {
            LOG.info("Trying to acquire lock for running setup.");
            lock.acquire();
            LOG.info("Acquired lock for running setup.");
            handleSetupInProgress(configuration, zookeeperProperties);
            for (SetupStep step : setupSteps) {
                LOG.info("Running setup step: {}", step);
                step.run();
            }
            clearSetupInProgress(zookeeperProperties);
        } catch (SetupException se) {
            LOG.error("Got setup exception while trying to setup", se);
            throw se;
        } catch (Throwable e) {
            LOG.error("Error running setup steps", e);
            throw new SetupException("Error running setup steps", e);
        } finally {
            releaseLock(lock);
            curatorFactory.close();
        }
    }
