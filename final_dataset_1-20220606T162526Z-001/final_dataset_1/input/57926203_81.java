@Override
    protected void update(InstanceIdentifier<ServiceFunctionState> instanceIdentifier,
                          ServiceFunctionState oldSf, ServiceFunctionState newSf) {
        // If this SF stops participating in RSPs, we need to unbind from its interfaces
        LOG.debug("Received service function state update event {} {} {}", instanceIdentifier, oldSf, newSf);
        int numberOfNewPaths = newSf.getSfServicePath() == null ? 0 : newSf.getSfServicePath().size();
        int numberOfOldPaths = oldSf.getSfServicePath() == null ? 0 : oldSf.getSfServicePath().size();
        String sfName = newSf.getName().getValue();
        if (numberOfNewPaths > numberOfOldPaths) {
            executor.execute(() -> interfaceManager.bindInterfacesOfServiceFunction(sfName));
        } else if (numberOfNewPaths < numberOfOldPaths && numberOfNewPaths <= 0) {
            executor.execute(() -> interfaceManager.unbindInterfacesOfServiceFunction(sfName));
        }
    }
