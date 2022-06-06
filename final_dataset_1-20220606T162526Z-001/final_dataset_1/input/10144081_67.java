@Override
    public OffsetDateTime getRandomValue() {
        long minSeconds = min.toEpochSecond();
        long maxSeconds = max.toEpochSecond();
        long seconds = (long) nextDouble(minSeconds, maxSeconds);
        int minNanoSeconds = min.getNano();
        int maxNanoSeconds = max.getNano();
        long nanoSeconds = (long) nextDouble(minNanoSeconds, maxNanoSeconds);
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(seconds, nanoSeconds),
                EasyRandomParameters.DEFAULT_DATES_RANGE.getMin().getZone());
    }
