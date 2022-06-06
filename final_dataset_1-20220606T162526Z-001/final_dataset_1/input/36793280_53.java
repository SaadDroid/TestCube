@Override
    public TimeLimiter timeLimiter(final String name) {
        return timeLimiter(name, getDefaultConfig(), HashMap.empty());
    }
