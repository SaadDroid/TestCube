public static LoadBalancerUsageRecord rndCurrentUsage() {
        LoadBalancerUsageRecord usage = new LoadBalancerUsageRecord();
        usage.setIncomingTransfer((long) rndInt(0, 1000000000));
        usage.setOutgoingTransfer((long) rndInt(0, 1000000000));
        return usage;
    }
