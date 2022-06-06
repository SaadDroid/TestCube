@Override
    public Duration yearsAndMonthsDuration(ZonedDateTime from, ZonedDateTime to) {
        try {
            return this.durationLib.yearsAndMonthsDuration(from, to);
        } catch (Exception e) {
            String message = String.format("yearsAndMonthsDuration(%s, %s)", from, to);
            logError(message, e);
            return null;
        }
    }
