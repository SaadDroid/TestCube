@Override
    public Instant getRandomValue() {
		long minEpochMillis = min.toEpochMilli();
		long maxEpochMillis = max.toEpochMilli();
		long randomEpochMillis = (long) nextDouble(minEpochMillis, maxEpochMillis);
		return Instant.ofEpochMilli(randomEpochMillis);
    }
