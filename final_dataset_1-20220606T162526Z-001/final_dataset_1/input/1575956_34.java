@Override
    public CompletableFuture<Versioned<LedgerMetadata>> createLedgerMetadata(long ledgerId,
                                                                             LedgerMetadata inputMetadata) {
        CompletableFuture<Versioned<LedgerMetadata>> promise = new CompletableFuture<>();
        /*
         * Create a random number and use it as creator token.
         */
        final long cToken = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
        final LedgerMetadata metadata;
        if (inputMetadata.getMetadataFormatVersion() > LedgerMetadataSerDe.METADATA_FORMAT_VERSION_2) {
            metadata = LedgerMetadataBuilder.from(inputMetadata).withCToken(cToken).build();
        } else {
            metadata = inputMetadata;
        }
        String ledgerPath = getLedgerPath(ledgerId);
        StringCallback scb = new StringCallback() {
            @Override
            public void processResult(int rc, String path, Object ctx, String name) {
                if (rc == Code.OK.intValue()) {
                    promise.complete(new Versioned<>(metadata, new LongVersion(0)));
                } else if (rc == Code.NODEEXISTS.intValue()) {
                    LOG.info("Ledger metadata for {} appears to already exist, checking cToken",
                            ledgerId);
                    if (metadata.getMetadataFormatVersion() > 2) {
                        CompletableFuture<Versioned<LedgerMetadata>> readFuture = readLedgerMetadata(ledgerId);
                        readFuture.handle((readMetadata, exception) -> {
                            if (exception == null) {
                                if (readMetadata.getValue().getCToken() == cToken) {
                                    FutureUtils.complete(promise, new Versioned<>(metadata, new LongVersion(0)));
                                } else {
                                    LOG.warn("Failed to create ledger metadata for {} which already exists", ledgerId);
                                    promise.completeExceptionally(new BKException.BKLedgerExistException());
                                }
                            } else if (exception instanceof KeeperException.NoNodeException) {
                                // This is a pretty strange case.  We tried to create the node, found that it
                                // already exists, but failed to find it when we reread it.  It's possible that
                                // we successfully created it, got an erroneous NODEEXISTS due to a resend,
                                // and then it got removed.  It's also possible that we actually lost the race
                                // and then it got removed.  I'd argue that returning an error here is the right
                                // path since recreating it is likely to cause problems.
                                LOG.warn("Ledger {} appears to have already existed and then been removed, failing"
                                        + " with LedgerExistException", ledgerId);
                                promise.completeExceptionally(new BKException.BKLedgerExistException());
                            } else {
                                LOG.error("Could not validate node for ledger {} after LedgerExistsException", ledgerId,
                                        exception);
                                promise.completeExceptionally(new BKException.ZKException(exception));
                            }
                            return null;
                        });
                    } else {
                        LOG.warn("Failed to create ledger metadata for {} which already exists", ledgerId);
                        promise.completeExceptionally(new BKException.BKLedgerExistException());
                    }
                } else {
                    LOG.error("Could not create node for ledger {}", ledgerId,
                            KeeperException.create(Code.get(rc), path));
                    promise.completeExceptionally(
                            new BKException.ZKException(KeeperException.create(Code.get(rc), path)));
                }
            }
        };
        final byte[] data;
        try {
            data = serDe.serialize(metadata);
        } catch (IOException ioe) {
            promise.completeExceptionally(new BKException.BKMetadataSerializationException(ioe));
            return promise;
        }

        List<ACL> zkAcls = ZkUtils.getACLs(conf);
        ZkUtils.asyncCreateFullPathOptimistic(zk, ledgerPath, data, zkAcls,
                                              CreateMode.PERSISTENT, scb, null);
        return promise;
    }
