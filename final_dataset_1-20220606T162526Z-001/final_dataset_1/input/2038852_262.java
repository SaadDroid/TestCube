@Override
    public void doOnMessage(final Message message) throws Exception {
        LOG.debug("Entering " + getClass());
        LOG.debug(message);

        MessageDataContainer dataContainer = getDataContainerFromMessage(message);
        ZeusSslTermination queTermination = dataContainer.getZeusSslTermination();
        LoadBalancer dbLoadBalancer = new LoadBalancer();

        try {
            LOG.debug("Grabbing loadbalancer...");
            dbLoadBalancer = loadBalancerService.getWithUserPages(dataContainer.getLoadBalancerId(), dataContainer.getAccountId());
            dbLoadBalancer.setUserName(dataContainer.getUserName());
        } catch (EntityNotFoundException enfe) {
            String alertDescription = String.format("Load balancer '%d' not found in database.", dataContainer.getLoadBalancerId());
            LOG.error(alertDescription, enfe);
            sendErrorToEventResourceUsingDataContainer(dataContainer);
            return;
        }

        //First pass
        List<SnmpUsage> usages = new ArrayList<SnmpUsage>();
        Map<Integer, SnmpUsage> usagesMap = new HashMap<Integer, SnmpUsage>();
        try {
            LOG.info(String.format("Collecting usage BEFORE ssl event for load balancer %s...", dbLoadBalancer.getId()));
            usages = usageEventCollection.getUsage(dbLoadBalancer);
            for (SnmpUsage usage : usages) {
                usagesMap.put(usage.getHostId(), usage);
            }
            LOG.info(String.format("Successfully collected usage BEFORE ssl event for load balancer %s", dbLoadBalancer.getId()));
        } catch (UsageEventCollectionException e) {
            LOG.error(String.format("Collection of the ssl usage event failed for " +
                    "load balancer: %s :: Exception: %s", dbLoadBalancer.getId(), e));
        }

        try {
            if (isRestAdapter()) {
                LOG.info("Updating load balancer ssl termination in STM...");
                reverseProxyLoadBalancerStmService.updateSslTermination(dbLoadBalancer, queTermination);
                LOG.debug("Successfully updated a load balancer ssl termination in Zeus.");
            } else {
                LOG.info("Updating load balancer ssl termination in ZXTM...");
                reverseProxyLoadBalancerService.updateSslTermination(dbLoadBalancer, queTermination);
            }
        } catch (Exception e) {
            String msg = Debug.getEST(e);
            LOG.error(String.format("Error updating loadbalancr %d: %s\n", dbLoadBalancer.getId(), msg));
            dbLoadBalancer.setStatus(LoadBalancerStatus.ERROR);
            String alertDescription = String.format("An error occurred while creating loadbalancer ssl termination '%d' in Zeus.:%s", dbLoadBalancer.getId(), msg);
            loadBalancerService.update(dbLoadBalancer);
            LOG.error(alertDescription, e);
            notificationService.saveAlert(dataContainer.getAccountId(), dataContainer.getLoadBalancerId(), e, ZEUS_FAILURE.name(), alertDescription);
            sendErrorToEventResource(dbLoadBalancer);
            return;
        }

        //Second pass
        List<SnmpUsage> usages2 = new ArrayList<SnmpUsage>();
        Map<Integer, SnmpUsage> usagesMap2 = new HashMap<Integer, SnmpUsage>();
        try {
            LOG.info(String.format("Collecting usage AFTER ssl event for load balancer %s...", dbLoadBalancer.getId()));
            usages2 = usageEventCollection.getUsage(dbLoadBalancer);
            for (SnmpUsage usage : usages2) {
                usagesMap2.put(usage.getHostId(), usage);
            }
            LOG.info(String.format("Successfully collected usage AFTER ssl event for load balancer %s", dbLoadBalancer.getId()));
        } catch (UsageEventCollectionException e) {
            LOG.error(String.format("Collection of the ssl usage event failed for " +
                    "load balancer: %s :: Exception: %s", dbLoadBalancer.getId(), e));
        }

        Calendar eventTime = Calendar.getInstance();

        SslTerminationUsage sslTermUsageHelper = new SslTerminationUsage();

        List<SnmpUsage> usagesToInsert = sslTermUsageHelper.getUsagesToInsert(dbLoadBalancer.getId(), dataContainer.getPreviousSslTermination(),
                                                                              queTermination.getSslTermination(), usagesMap, usagesMap2);

        // Notify usage processor
        try {
            if (queTermination.getSslTermination().getEnabled()) {
                if (queTermination.getSslTermination().getSecureTrafficOnly()) {
                    usageEventCollection.processUsageEvent(usagesToInsert, dbLoadBalancer, UsageEvent.SSL_ONLY_ON, eventTime);
                } else {
                    usageEventCollection.processUsageEvent(usagesToInsert, dbLoadBalancer, UsageEvent.SSL_MIXED_ON, eventTime);
                }
            } else {
                usageEventCollection.processUsageEvent(usagesToInsert, dbLoadBalancer, UsageEvent.SSL_OFF, eventTime);
            }
            LOG.info(String.format("Finished processing usage event for load balancer: %s", dbLoadBalancer.getId()));
        } catch (Exception exc) {
            String exceptionStackTrace = Debug.getExtendedStackTrace(exc);
            String usageAlertDescription = String.format("An error occurred while processing the usage for an event on loadbalancer %d: \n%s\n\n%s",
                                                         dbLoadBalancer.getId(), exc.getMessage(), exceptionStackTrace);
            LOG.error(usageAlertDescription);
            notificationService.saveAlert(dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), exc, USAGE_FAILURE.name(), usageAlertDescription);
        }
        // Update load balancer status in DB
        loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ACTIVE);

        addAtomEntriesForSslTermination(dbLoadBalancer, dbLoadBalancer.getSslTermination());

        LOG.info(String.format("Updated load balancer '%d' ssl termination successfully for loadbalancer: ", dbLoadBalancer.getId()));
    }
