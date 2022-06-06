public void checkIfDataCenterIsUsable(final DataCenter dataCenter, final Account account) {
        final long dataCenterId = dataCenter.getId();
        logger.debug("Checking if data center " + dataCenterId + " is usable.");
        if (AllocationState.Disabled == dataCenter.getAllocationState() && !accountManager.isRootAdmin(account.getId())) {
            final PermissionDeniedException ex = new PermissionDeniedException("Cannot perform this operation, data center with specified id is currently disabled");
            ex.addProxyObject(dataCenter.getUuid(), "dcId");
            throw ex;
        }
        logger.debug("Data center " + dataCenterId + "is usable");
    }
