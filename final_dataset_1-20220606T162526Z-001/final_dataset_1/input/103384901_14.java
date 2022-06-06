public static String formatInUTC(DateTime date) {
        return date != null ? FORMATTER.print(date.toDateTime(DateTimeZone.UTC)) : null;
    }
