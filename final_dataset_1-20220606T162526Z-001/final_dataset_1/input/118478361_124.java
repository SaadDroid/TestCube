@Override
    public Double monthDiff(ZonedDateTime dateTime1, ZonedDateTime dateTime2) {
        try {
            return Double.valueOf(this.dateLib.monthDiff(dateTime1, dateTime2));
        } catch (Exception e) {
            String message = String.format("monthDiff(%s, %s)", dateTime1, dateTime2);
            logError(message, e);
            return null;
        }
    }
