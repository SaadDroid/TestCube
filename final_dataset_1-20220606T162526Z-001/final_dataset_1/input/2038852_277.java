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
                LOG.debug(String.format("Updating session persistence for load balancer '%d' in STM...", dbLoadBalancer.getId()));
                reverseProxyLoadBalancerStmService.updateLoadBalancer(dbLoadBalancer, queueLb);
                LOG.debug(String.format("Successfully updated session persistence for load balancer '%d' in Zeus...", dbLoadBalancer.getId()));
            } else {
                if (dbLoadBalancer.getSessionPersistence() != SessionPersistence.NONE) {
                    LOG.debug(String.format("Updating session persistence for load balancer '%d' in ZXTM...", dbLoadBalancer.getId()));
                    reverseProxyLoadBalancerService.updateSessionPersistence(dbLoadBalancer.getId(), dbLoadBalancer.getAccountId(), dbLoadBalancer.getSessionPersistence());
                    LOG.debug(String.format("Successfully updated session persistence for load balancer '%d' in Zeus...", dbLoadBalancer.getId()));
                }
            }
        } catch (Exception e) {
            loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ERROR);
            String alertDescription = String.format("Error updating session persistence in Zeus for loadbalancer '%d'.", dbLoadBalancer.getId());
            LOG.error(alertDescription, e);
            notificationService.saveAlert(dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), e, ZEUS_FAILURE.name(), alertDescription);
            sendErrorToEventResource(queueLb);

            return;
        }

        // Update load balancer status in DB
        loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ACTIVE);

        if (dbLoadBalancer.getSessionPersistence() != SessionPersistence.NONE) {
            // Add atom entry
            String atomSummary = String.format("Session persistence successfully updated to '%s'", dbLoadBalancer.getSessionPersistence().name());
            notificationService.saveSessionPersistenceEvent(queueLb.getUserName(), dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), UPDATE_PERSISTENCE_TITLE, atomSummary, UPDATE_SESSION_PERSISTENCE, UPDATE, INFO);
        }

        LOG.info(String.format("Update session persistence operation complete for load balancer '%d'.", dbLoadBalancer.getId()));
    }
