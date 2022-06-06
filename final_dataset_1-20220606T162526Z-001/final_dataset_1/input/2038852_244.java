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

        Node nodeToDelete = queueLb.getNodes().iterator().next();
        for (Node node : dbLoadBalancer.getNodes()) {
            if (node.getId().equals(nodeToDelete.getId())) {
                nodeToDelete = node;
                break;
            }
        }

        try {
            if (isRestAdapter()) {
                LOG.debug(String.format("Removing node '%d' from load balancer '%d' in STM...", nodeToDelete.getId(), queueLb.getId()));
//                dbLoadBalancer.setNodes(nodeService.getAllNodesByAccountIdLoadBalancerId(dbLoadBalancer.getAccountId(), dbLoadBalancer.getId()));
                reverseProxyLoadBalancerStmService.removeNode(dbLoadBalancer, nodeToDelete);
                LOG.debug(String.format("Successfully removed node '%d' from load balancer '%d' in STM.", nodeToDelete.getId(), queueLb.getId()));
            } else {
                LOG.debug(String.format("Removing node '%d' from load balancer '%d' in ZXTM...", nodeToDelete.getId(), queueLb.getId()));
                reverseProxyLoadBalancerService.setNodesPriorities(ZxtmNameBuilder.genVSName(dbLoadBalancer), dbLoadBalancer);
                reverseProxyLoadBalancerService.removeNode(queueLb.getId(), queueLb.getAccountId(), nodeToDelete);
                LOG.debug(String.format("Successfully removed node '%d' from load balancer '%d' in Zeus.", nodeToDelete.getId(), queueLb.getId()));
            }
        } catch (Exception e) {
            loadBalancerService.setStatusForOp(dbLoadBalancer, LoadBalancerStatus.ERROR);
            String alertDescription = String.format("Error removing node '%d' in Zeus for loadbalancer '%d'.", nodeToDelete.getId(), queueLb.getId());
            LOG.error(alertDescription, e);
            notificationService.saveAlert(queueLb.getAccountId(), queueLb.getId(), e, ZEUS_FAILURE.name(), alertDescription);
            sendErrorToEventResource(queueLb, nodeToDelete);

            return;
        }

        // Remove node from load balancer in DB
        dbLoadBalancer = nodeService.delNodes(dbLoadBalancer, Arrays.asList(nodeToDelete));

        // Update load balancer status in DB
        loadBalancerService.setStatusForOp(dbLoadBalancer, LoadBalancerStatus.ACTIVE);

        //Set status record
        loadBalancerStatusHistoryService.save(dbLoadBalancer.getAccountId(), dbLoadBalancer.getId(), LoadBalancerStatus.ACTIVE);

        // Add atom entry
        String atomTitle = "Node Successfully Deleted";
        String atomSummary = "Node successfully deleted";
        notificationService.saveNodeEvent(queueLb.getUserName(), queueLb.getAccountId(), queueLb.getId(), nodeToDelete.getId(), atomTitle, atomSummary, DELETE_NODE, DELETE, INFO);

        LOG.info(String.format("Delete node operation complete for load balancer '%d'.", queueLb.getId()));
    }
