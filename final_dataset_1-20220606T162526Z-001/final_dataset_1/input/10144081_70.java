@Override
    public LocalDate getRandomValue() {
        long minEpochDay = min.getLong(ChronoField.EPOCH_DAY);
        long maxEpochDay = max.getLong(ChronoField.EPOCH_DAY);
        long randomEpochDay = (long) nextDouble(minEpochDay, maxEpochDay);
        return LocalDate.ofEpochDay(randomEpochDay);
    }
