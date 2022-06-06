@Override
    public ImmutableAggregate<TState, TEvent> load(final String aggregateId) {
        TState state = projection.empty();
        int currentStreamPosition = 0;
        try {
            while (true) { // Exit through return
                logger.debug("Reading events for {} from {}", aggregateId, currentStreamPosition);
                EventReadResult<TEvent> readResult = eventRepository.read(
                        aggregateId,
                        currentStreamPosition,
                        maxEventsPerRead);

                if (readResult == null || readResult.getEvents().isEmpty()) {
                    // Not found, return empty wrapper as per contract
                    return DefaultImmutableAggregate.createNew(
                            projection,
                            aggregateId);
                }

                Iterable<TEvent> events = readResult
                        .getEvents()
                        .stream()
                        .map(EventRecord::getEvent)
                        .collect(Collectors.toList());
                state = projection.apply(aggregateId, state, events);

                if (readResult.isEndOfStream()) {
                    return DefaultImmutableAggregate.fromExisting(
                            projection,
                            aggregateId,
                            readResult.getLastVersion(),
                            state);
                }

                currentStreamPosition = readResult.getNextVersion();
            }
        } finally {
            if (currentStreamPosition > LARGE_EVENT_STREAM_WARNING_CUTOFF) {
                logger.warn(
                        "Read large stream {} consisting of {} events - consider snapshotting?",
                        aggregateId,
                        currentStreamPosition);
            }
        }
    }
