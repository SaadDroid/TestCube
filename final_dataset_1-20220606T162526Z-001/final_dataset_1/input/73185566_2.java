@Override
    public Publisher<EventSubscriptionUpdate<T>> getStreamPublisher(
            final String streamId,
            final Integer fromVersion) {
        logger.info("Creating publisher for {} (in {}) (starting with version {})",
                streamId, streamPrefix, fromVersion);

        return Flux.create(emitter -> {
            final CatchUpSubscription subscription = eventStore.subscribeToStreamFrom(
                    toEsStreamId(streamId),
                    convertTo64Bit(fromVersion),
                    defaultSubscriptionSettings,
                    new EmitterListener(emitter, streamPrefix + "-" + streamId));
            emitter.setCancellation(() -> {
                logger.info("Closing ESJC subscription (asynchronously)");
                subscription.stop();
            });
        });
    }
