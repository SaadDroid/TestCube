public <T> T nextObject(final Class<T> type) {
        return doPopulateBean(type, new RandomizationContext(type, parameters));
    }
