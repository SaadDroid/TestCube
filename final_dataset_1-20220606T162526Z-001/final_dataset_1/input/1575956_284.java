public static CompletableFuture<Optional<LogRecordWithDLSN>> getLogRecordNotLessThanTxId(
            final String logName,
            final LogSegmentMetadata segment,
            final long transactionId,
            final ExecutorService executorService,
            final LogSegmentEntryStore entryStore,
            final int nWays) {
        if (!segment.isInProgress()) {
            if (segment.getLastTxId() < transactionId) {
                // all log records whose transaction id is less than provided transactionId
                // then return none
                Optional<LogRecordWithDLSN> noneRecord = Optional.empty();
                return FutureUtils.value(noneRecord);
            }
        }

        final CompletableFuture<Optional<LogRecordWithDLSN>> promise =
                new CompletableFuture<Optional<LogRecordWithDLSN>>();
        final FutureEventListener<LogSegmentRandomAccessEntryReader> openReaderListener =
            new FutureEventListener<LogSegmentRandomAccessEntryReader>() {
                @Override
                public void onSuccess(final LogSegmentRandomAccessEntryReader reader) {
                    promise.whenComplete((value, cause) -> reader.asyncClose());
                    long lastEntryId = reader.getLastAddConfirmed();
                    if (lastEntryId < 0) {
                        // it means that the log segment is created but not written yet or an empty log segment.
                        //it is equivalent to 'all log records whose transaction id is less than provided transactionId'
                        Optional<LogRecordWithDLSN> nonRecord = Optional.empty();
                        promise.complete(nonRecord);
                        return;
                    }
                    // all log records whose transaction id is not less than provided transactionId
                    if (segment.getFirstTxId() >= transactionId) {
                        final FirstTxIdNotLessThanSelector selector =
                                new FirstTxIdNotLessThanSelector(transactionId);
                        asyncReadRecordFromEntries(
                                logName,
                                reader,
                                segment,
                                executorService,
                                new SingleEntryScanContext(0L),
                                selector
                        ).whenComplete(new FutureEventListener<LogRecordWithDLSN>() {
                            @Override
                            public void onSuccess(LogRecordWithDLSN value) {
                                promise.complete(Optional.of(selector.result()));
                            }

                            @Override
                            public void onFailure(Throwable cause) {
                                promise.completeExceptionally(cause);
                            }
                        });

                        return;
                    }
                    getLogRecordNotLessThanTxIdFromEntries(
                            logName,
                            segment,
                            transactionId,
                            executorService,
                            reader,
                            Lists.newArrayList(0L, lastEntryId),
                            nWays,
                            Optional.<LogRecordWithDLSN>empty(),
                            promise);
                }

                @Override
                public void onFailure(final Throwable cause) {
                    promise.completeExceptionally(cause);
                }
            };

        entryStore.openRandomAccessReader(segment, false)
                .whenCompleteAsync(openReaderListener, executorService);
        return promise;
    }
