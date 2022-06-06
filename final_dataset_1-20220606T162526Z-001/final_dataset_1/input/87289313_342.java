@Override
    public Date apply(final String dateString) {
        if (isNull(dateString)) {
            return null;
        }

        try {
            final Date date;
            if (isNull(format)) {
                date = DateUtil.parse(dateString, timeZone);
            } else {
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                if (nonNull(timeZone)) {
                    simpleDateFormat.setTimeZone(timeZone);
                }
                date = simpleDateFormat.parse(dateString);
            }
            return date;
        } catch (final ParseException e) {
            throw new IllegalArgumentException("Date string could not be parsed: " + dateString, e);
        }
    }
