public int dummyCustomerApi(Tenant tenant) {
        String tenantName = tenant.getName();
        long count = CallsCount.getCount(tenantName);
        LOGGER.debug("Counter for {} : {} ", tenant.getName(), count);
        if (count >= tenant.getAllowedCallsPerSecond()) {
            LOGGER.error("API access per second limit reached for: {}", tenantName);
            return -1;
        }
        CallsCount.incrementCount(tenantName);
        return getRandomCustomerId();
    }
