@Override
    public void doOnMessage(final Message message) throws Exception {
        LOG.debug("Entering " + getClass());
        LOG.debug(message);
        LoadBalancer queueLb = getLoadbalancerFromMessage(message);
        LoadBalancer dbLoadBalancer;

        try {
            dbLoadBalancer = loadBalancerService.getWithUserPages(queueLb.getId(), queueLb.getAccountId());
        } catch (EntityNotFoundException enfe) {
            String alertDescription = String.format("Load balancer '%d' not found in database.", queueLb.getId());
            LOG.error(alertDescription, enfe);
            notificationService.saveAlert(queueLb.getAccountId(), queueLb.getId(), enfe, DATABASE_FAILURE.name(), alertDescription);
            sendErrorToEventResource(queueLb);
            return;
        }

        try {
            if (isRestAdapter()) {
                LOG.debug("Deleting connection throttle in STM...");
                reverseProxyLoadBalancerStmService.deleteConnectionThrottle(dbLoadBalancer);
                LOG.debug("Successfully deleted connection throttle in Zeus.");
            } else {
                LOG.debug("Deleting connection throttle in ZXTM...");
                reverseProxyLoadBalancerService.deleteConnectionThrottle(dbLoadBalancer);
                LOG.debug("Successfully deleted connection throttle in Zeus.");
            }
        } catch (Exception e) {
            loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ERROR);
            String alertDescription = String.format("Error deleting connection throttle in Zeus for loadbalancer '%d'.", queueLb.getId());
            LOG.error(alertDescription, e);
            notificationService.saveAlert(queueLb.getAccountId(), queueLb.getId(), e, ZEUS_FAILURE.name(), alertDescription);
            sendErrorToEventResource(queueLb);

            return;
        }

        connectionThrottleService.delete(dbLoadBalancer);
        loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ACTIVE);

        // Add atom entry
        String atomTitle = "Connection Throttle Successfully Deleted";
        String atomSummary = "Connection throttle successfully deleted";
        try {
            //TODO: fix the event...
            notificationService.saveConnectionLimitEvent(queueLb.getUserName(), dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), dbLoadBalancer.getConnectionLimit().getId(), atomTitle, atomSummary, DELETE_CONNECTION_THROTTLE, DELETE, INFO);
        } catch (PersistenceException pe) {
            LOG.error("Error saving the connection throttle event for load balancer: " + queueLb.getId() + "for account: " + queueLb.getAccountId());
        }

        LOG.info(String.format("Delete connection throttle operation complete for load balancer '%d'.", queueLb.getId()));
    }
