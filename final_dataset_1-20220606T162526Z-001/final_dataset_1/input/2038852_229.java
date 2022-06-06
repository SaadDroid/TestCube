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

        Node nodeToUpdate = getNodeToUpdate(queueLb);

        try {
            if (isRestAdapter()) {
                LOG.info(String.format("Updating nodes for load balancer '%d' in STM...", dbLoadBalancer.getId()));
                reverseProxyLoadBalancerStmService.setNodes(dbLoadBalancer);
                LOG.info(String.format("Successfully updated nodes for load balancer '%d' in Zeus.", dbLoadBalancer.getId()));
            } else {
                LOG.info(String.format("Updating nodes for load balancer '%d' in ZXTM...", dbLoadBalancer.getId()));
                String poolName = ZxtmNameBuilder.genVSName(dbLoadBalancer);
                reverseProxyLoadBalancerService.setNodes(dbLoadBalancer);
                reverseProxyLoadBalancerService.setNodesPriorities(poolName, dbLoadBalancer);
                LOG.info(String.format("Successfully updated nodes for load balancer '%d' in Zeus.", dbLoadBalancer.getId()));

            }
        } catch (Exception e) {
            loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ERROR);
            String alertDescription = String.format("Error updating node '%d' in Zeus for loadbalancer '%d'.", nodeToUpdate.getId(), dbLoadBalancer.getId());
            LOG.error(alertDescription, e);
            notificationService.saveAlert(dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), e, ZEUS_FAILURE.name(), alertDescription);
            sendErrorToEventResource(queueLb, nodeToUpdate);

            return;
        }

        // Update load balancer status in DB
        loadBalancerService.setStatus(dbLoadBalancer, LoadBalancerStatus.ACTIVE);

        // Add atom entry
        String atomTitle = "Node Successfully Updated";
        String atomSummary = createAtomSummary(nodeToUpdate).toString();
        notificationService.saveNodeEvent(queueLb.getUserName(), dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), nodeToUpdate.getId(), atomTitle, atomSummary, UPDATE_NODE, UPDATE, INFO);

        LOG.info(String.format("Update node operation complete for load balancer '%d'.", dbLoadBalancer.getId()));
    }
