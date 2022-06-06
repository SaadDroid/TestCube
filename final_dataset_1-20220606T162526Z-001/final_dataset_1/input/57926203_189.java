@Override
    public void add(ServiceFunction serviceFunction) {
        if (serviceFunction != null) {
            LOG.debug("Adding Service Function: {}", serviceFunction.getName());

            if (!SfcProviderServiceTypeAPI.createServiceFunctionTypeEntry(serviceFunction)) {
                LOG.error("Failed to create Service Function: ", serviceFunction.getName());
            }
        }
    }
