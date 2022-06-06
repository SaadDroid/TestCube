@Override
    protected void remove(InstanceIdentifier<ServiceFunctionState> instanceIdentifier,
                          ServiceFunctionState oldSf) {
        // If this SF stops participating in RSPs, we need to unbind from its interfaces
        LOG.debug("Received service function state remove event {} {}", instanceIdentifier, oldSf);
        int numberOfOldPaths = oldSf.getSfServicePath() == null ? 0 : oldSf.getSfServicePath().size();
        if (numberOfOldPaths > 0) {
            String sfName = oldSf.getName().getValue();
            executor.execute(() -> interfaceManager.unbindInterfacesOfServiceFunction(sfName));
        }
    }
