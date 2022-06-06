@Override
    protected void lock() {
        final Vpc vpcLock = vpcDao.acquireInLockTable(vpc.getId());
        if (vpcLock == null) {
            throw new ConcurrentOperationException("Unable to lock vpc " + vpc.getId());
        }
        tableLockId = vpcLock.getId();
    }
