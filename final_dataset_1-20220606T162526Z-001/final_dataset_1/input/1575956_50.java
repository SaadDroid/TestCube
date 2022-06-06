@Override
    public void registerLedgerMetadataListener(long ledgerId, LedgerMetadataListener listener) {
        if (null != listener) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Registered ledger metadata listener {} on ledger {}.", listener, ledgerId);
            }
            Set<LedgerMetadataListener> listenerSet = listeners.get(ledgerId);
            if (listenerSet == null) {
                Set<LedgerMetadataListener> newListenerSet = new HashSet<LedgerMetadataListener>();
                Set<LedgerMetadataListener> oldListenerSet = listeners.putIfAbsent(ledgerId, newListenerSet);
                if (null != oldListenerSet) {
                    listenerSet = oldListenerSet;
                } else {
                    listenerSet = newListenerSet;
                }
            }
            synchronized (listenerSet) {
                listenerSet.add(listener);
            }
            new ReadLedgerMetadataTask(ledgerId).run();
        }
    }
