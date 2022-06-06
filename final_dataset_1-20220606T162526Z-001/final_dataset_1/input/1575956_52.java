@Override
    public void unregisterLedgerMetadataListener(long ledgerId, LedgerMetadataListener listener) {
        Set<LedgerMetadataListener> listenerSet = listeners.get(ledgerId);
        if (listenerSet != null) {
            synchronized (listenerSet) {
                if (listenerSet.remove(listener)) {
                    if (LOG.isDebugEnabled()) {
                        LOG.debug("Unregistered ledger metadata listener {} on ledger {}.", listener, ledgerId);
                    }
                }
                if (listenerSet.isEmpty()) {
                    listeners.remove(ledgerId, listenerSet);
                }
            }
        }
    }
