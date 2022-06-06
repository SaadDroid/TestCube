public static long convertToHours(TimePeriod duration) {
        return TimeUnit.SECONDS.toHours(duration.getDuration());
    }
