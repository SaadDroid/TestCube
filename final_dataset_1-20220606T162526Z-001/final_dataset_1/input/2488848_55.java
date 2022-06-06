public static int minute(String str) {
        return dateTime.fromString(str).getMinuteOfHour();
    }
