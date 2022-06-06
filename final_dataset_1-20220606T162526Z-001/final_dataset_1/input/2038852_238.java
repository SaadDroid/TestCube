@Override
    public void doOnMessage(Message message) throws Exception {
        LOG.debug("Entering " + getClass());
        LOG.debug(message);
        LoadBalancer queLb = getLoadbalancerFromMessage(message);
        LoadBalancer dbLoadBalancer;

        try {
            dbLoadBalancer = loadBalancerService.getWithUserPages(queLb.getId(), queLb.getAccountId());
        } catch (EntityNotFoundException enfe) {
            String alertDescription = String.format("Load balancer '%d' not found in database.", queLb.getId());
            LOG.error(alertDescription, enfe);
            notificationService.saveAlert(queLb.getAccountId(), queLb.getId(), enfe, DATABASE_FAILURE.name(), alertDescription);
            sendErrorToEventResource(queLb);
            return;
        }

        try {
            if (isRestAdapter()) {
                LOG.debug(String.format("Updating content caching for load balancer '%d' in STM...", dbLoadBalancer.getId()));
                reverseProxyLoadBalancerStmService.updateLoadBalancer(dbLoadBalancer, queLb);
                LOG.debug(String.format("Successfully updated content caching for load balancer '%d' in Zeus.", dbLoadBalancer.getId()));
            } else {
                LOG.debug(String.format("Updating connection throttle for load balancer '%d' in ZXTM...", dbLoadBalancer.getId()));
                reverseProxyLoadBalancerService.updateContentCaching(dbLoadBalancer);
                LOG.debug(String.format("Successfully updated connection throttle for load balancer '%d' in Zeus.", dbLoadBalancer.getId()));
            }
        } catch (Exception e) {
            loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ERROR);
            String alertDescription = String.format("Error updating content caching for load balancer '%d' in Zeus.", dbLoadBalancer.getId());
            LOG.error(alertDescription, e);
            notificationService.saveAlert(dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), e, ZEUS_FAILURE.name(), alertDescription);
            sendErrorToEventResource(queLb);
            return;
        }

        String desc = "Content caching successully set to " + dbLoadBalancer.isContentCaching().toString();
        notificationService.saveLoadBalancerEvent(queLb.getUserName(), dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), UPDATE_CCACHING_TITLE, desc, EventType.UPDATE_CONTENT_CACHING, UPDATE, EventSeverity.INFO);

        // Update load balancer status in DB
        loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ACTIVE);

        LOG.info("Update content caching operation complete.");
    }