public static long convertToDays(TimePeriod duration) {
        return TimeUnit.SECONDS.toDays(duration.getDuration());
    }
