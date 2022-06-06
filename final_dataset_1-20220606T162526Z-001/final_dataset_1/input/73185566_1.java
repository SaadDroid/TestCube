@Override
    public EventReadResult<T> read(final String streamId, final int version, final int maxEvents) {
        return readInternal(toEsStreamId(streamId), version, maxEvents, false);
    }
