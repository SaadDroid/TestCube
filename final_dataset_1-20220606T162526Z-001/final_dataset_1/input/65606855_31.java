@NonNull
    private static String formatDate(@NonNull String format, @NonNull ZonedDateTime isoDate) {
        return getFormatter(format).format(isoDate);
    }
