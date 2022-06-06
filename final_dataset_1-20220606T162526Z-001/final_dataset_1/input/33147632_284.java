static String getRelativeTimeString(Resources res, long currentTimeMillis, long timestamp) {
        final long diff = currentTimeMillis - timestamp;
        if (diff >= 0) {
            if (diff < DateUtils.MINUTE_IN_MILLIS) { // Less than a minute ago
                final int secs = (int) (diff / 1000);
                return res.getQuantityString(R.plurals.tw__time_secs, secs, secs);
            } else if (diff < DateUtils.HOUR_IN_MILLIS) { // Less than an hour ago
                final int mins = (int) (diff / DateUtils.MINUTE_IN_MILLIS);
                return res.getQuantityString(R.plurals.tw__time_mins, mins, mins);
            } else if (diff < DateUtils.DAY_IN_MILLIS) { // Less than a day ago
                final int hours = (int) (diff / DateUtils.HOUR_IN_MILLIS);
                return res.getQuantityString(R.plurals.tw__time_hours, hours, hours);
            } else {
                final Calendar now = Calendar.getInstance();
                now.setTimeInMillis(currentTimeMillis);
                final Calendar c = Calendar.getInstance();
                c.setTimeInMillis(timestamp);
                final Date d = new Date(timestamp);

                if (now.get(Calendar.YEAR) == c.get(Calendar.YEAR)) {
                    // Same year
                    return RELATIVE_DATE_FORMAT.formatShortDateString(res, d);
                } else {
                    // Outside of our year
                    return RELATIVE_DATE_FORMAT.formatLongDateString(res, d);
                }
            }
        }
        return RELATIVE_DATE_FORMAT.formatLongDateString(res, new Date(timestamp));
    }
