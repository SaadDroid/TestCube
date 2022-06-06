@Override
    public Duration fromBytes(byte[] bytes) {
        return Duration.of(longConverter.fromBytes(bytes), ChronoUnit.MILLIS);
    }
