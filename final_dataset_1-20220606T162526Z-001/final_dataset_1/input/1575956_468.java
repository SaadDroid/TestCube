@Override
    public CompletableFuture<GetActiveRangesResponse> getActiveRanges(GetActiveRangesRequest request) {
        final long streamId = request.getStreamId();

        MetaRangeImpl metaRange = streams.get(streamId);

        if (null == metaRange) {
            final MetaRangeImpl metaRangeImpl = new MetaRangeImpl(store, executor, rangePlacementPolicy);
            return metaRangeImpl.load(streamId)
                .thenCompose(mr -> {
                    if (null == mr) {
                        // meta range doesn't exist, talk to root range to get the stream props
                        return clientManager.getStreamProperties(streamId)
                            .thenCompose(streamProperties ->
                                createStreamIfMissing(streamId, metaRangeImpl, streamProperties));
                    } else {
                        synchronized (streams) {
                            streams.put(streamId, (MetaRangeImpl) mr);
                        }
                        return getActiveRanges(mr);
                    }
                });
        } else {
            return getActiveRanges(metaRange);
        }
    }
