@Override
    public CompletableFuture<LedgerHandle> tryObtain(final Transaction<Object> txn,
                                                     final Transaction.OpListener<LedgerHandle> listener) {
        final SimpleLedgerAllocator allocator;
        synchronized (this) {
            if (allocatingList.isEmpty()) {
                return FutureUtils.exception(new IOException("No ledger allocator available under " + poolPath + "."));
            } else {
                allocator = allocatingList.removeFirst();
            }
        }

        final CompletableFuture<LedgerHandle> tryObtainPromise = new CompletableFuture<LedgerHandle>();
        final FutureEventListener<LedgerHandle> tryObtainListener = new FutureEventListener<LedgerHandle>() {
            @Override
            public void onSuccess(LedgerHandle lh) {
                synchronized (LedgerAllocatorPool.this) {
                    obtainMap.put(lh, allocator);
                    reverseObtainMap.put(allocator, lh);
                    tryObtainPromise.complete(lh);
                }
            }

            @Override
            public void onFailure(Throwable cause) {
                try {
                    rescueAllocator(allocator);
                } catch (IOException ioe) {
                    logger.info("Failed to rescue allocator {}", allocator.allocatePath, ioe);
                }
                tryObtainPromise.completeExceptionally(cause);
            }
        };

        allocator.tryObtain(txn, new Transaction.OpListener<LedgerHandle>() {
            @Override
            public void onCommit(LedgerHandle lh) {
                confirmObtain(allocator);
                listener.onCommit(lh);
            }

            @Override
            public void onAbort(Throwable t) {
                abortObtain(allocator);
                listener.onAbort(t);
            }
        }).whenComplete(tryObtainListener);
        return tryObtainPromise;
    }
