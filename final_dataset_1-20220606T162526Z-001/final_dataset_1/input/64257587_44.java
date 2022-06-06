public void track(@Nonnull String eventName,
                      @Nonnull String userId) throws UnknownEventTypeException {
        track(eventName, userId, Collections.<String, String>emptyMap(), Collections.<String, Object>emptyMap());
    }
