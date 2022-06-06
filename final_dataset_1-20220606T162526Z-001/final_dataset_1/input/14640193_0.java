public static Date parseLogcatTimeStamp(String line) {
        Matcher matcher = LOGCAT_TIMESTAMP_PATTERN.matcher(line);

        if (matcher.find()) {
            int month = Integer.valueOf(matcher.group(1));
            int day = Integer.valueOf(matcher.group(2));

            int hour = Integer.valueOf(matcher.group(3));
            int minute = Integer.valueOf(matcher.group(4));
            int second = Integer.valueOf(matcher.group(5));
            int ms = Integer.valueOf(matcher.group(6));

            Calendar calendar = Calendar.getInstance();

            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.DAY_OF_MONTH, day);

            calendar.set(Calendar.HOUR_OF_DAY, hour);
            calendar.set(Calendar.MINUTE, minute);
            calendar.set(Calendar.SECOND, second);
            calendar.set(Calendar.MILLISECOND, ms);

            return calendar.getTime();
        } else {
            throw new IllegalArgumentException("Invalid Line");
        }
    }
