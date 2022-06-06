@Override
    /**
     * Determines if this context object is active.
     *
     * @return true if there is a current global transaction and its status is
     *              {@Link javax.transaction.Status.STATUS_ACTIVE}
     *         false otherwise
     */
    public boolean isActive() {
        try {
            //Just calling it but not checking for != null on return value as its already done inside method
            getTransactionSynchronizationRegistry();
            return true;
        } catch (ContextNotActiveException ignore) {
        }
        return false;
    }
