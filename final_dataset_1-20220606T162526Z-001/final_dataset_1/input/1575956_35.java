@Override
    public CompletableFuture<Void> removeLedgerMetadata(final long ledgerId, final Version version) {
        CompletableFuture<Void> promise = new CompletableFuture<>();
        int znodeVersion = -1;
        if (Version.NEW == version) {
            LOG.error("Request to delete ledger {} metadata with version set to the initial one", ledgerId);
            promise.completeExceptionally(new BKException.BKMetadataVersionException());
            return promise;
        } else if (Version.ANY != version) {
            if (!(version instanceof LongVersion)) {
                LOG.info("Not an instance of ZKVersion: {}", ledgerId);
                promise.completeExceptionally(new BKException.BKMetadataVersionException());
                return promise;
            } else {
                znodeVersion = (int) ((LongVersion) version).getLongVersion();
            }
        }

        VoidCallback callbackForDelete = new VoidCallback() {
            @Override
            public void processResult(int rc, String path, Object ctx) {
                if (rc == KeeperException.Code.NONODE.intValue()) {
                    LOG.warn("Ledger node does not exist in ZooKeeper: ledgerId={}.  Returning success.", ledgerId);
                    FutureUtils.complete(promise, null);
                } else if (rc == KeeperException.Code.OK.intValue()) {
                    // removed listener on ledgerId
                    Set<LedgerMetadataListener> listenerSet = listeners.remove(ledgerId);
                    if (null != listenerSet) {
                        if (LOG.isDebugEnabled()) {
                            LOG.debug(
                                    "Remove registered ledger metadata listeners on ledger {} after ledger is deleted.",
                                    ledgerId);
                        }
                    } else {
                        if (LOG.isDebugEnabled()) {
                            LOG.debug("No ledger metadata listeners to remove from ledger {} when it's being deleted.",
                                    ledgerId);
                        }
                    }
                    FutureUtils.complete(promise, null);
                } else {
                    promise.completeExceptionally(
                            new BKException.ZKException(KeeperException.create(Code.get(rc), path)));
                }
            }
        };
        String ledgerZnodePath = getLedgerPath(ledgerId);
        if (this instanceof HierarchicalLedgerManager || this instanceof LongHierarchicalLedgerManager) {
            /*
             * do recursive deletes only for HierarchicalLedgerManager and
             * LongHierarchicalLedgerManager
             */
            ZkUtils.asyncDeleteFullPathOptimistic(zk, ledgerZnodePath, znodeVersion, callbackForDelete,
                    ledgerZnodePath);
        } else {
            zk.delete(ledgerZnodePath, znodeVersion, callbackForDelete, null);
        }
        return promise;
    }
