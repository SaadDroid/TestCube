public static GregorianCalendar fromString(String datetime) {
        Matcher m = CMISQL_PATTERN.matcher(datetime);
        if (!m.matches()) {
            throw new IllegalArgumentException("Invalid datetime format: " + datetime);
        }
        String tz = m.group(8);
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance(TimeZone.getTimeZone("GMT"
                + (tz == null ? "" : tz)));
        cal.set(Calendar.YEAR, Integer.parseInt(m.group(1)));
        cal.set(Calendar.MONTH, Integer.parseInt(m.group(2)) - 1);
        cal.set(Calendar.DATE, Integer.parseInt(m.group(3)));
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(m.group(4)));
        cal.set(Calendar.MINUTE, Integer.parseInt(m.group(5)));
        cal.set(Calendar.SECOND, Integer.parseInt(m.group(6)));
        String decimals = m.group(7);
        int ms = decimals == null ? 0 : Integer.parseInt((decimals + "00").substring(0, 3));
        cal.set(Calendar.MILLISECOND, ms);
        return cal;
    }
