@Override
    protected void unlock() {
        if (tableLockId != null) {
            vpcDao.releaseFromLockTable(tableLockId);
            if (logger.isDebugEnabled()) {
                logger.debug("Lock is released for vpc id " + tableLockId + " as a part of router startup in " + dest);
            }
        }
    }
