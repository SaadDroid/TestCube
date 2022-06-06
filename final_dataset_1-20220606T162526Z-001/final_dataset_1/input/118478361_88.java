@Override
    public BigDecimal monthDiff(XMLGregorianCalendar dateTime1, XMLGregorianCalendar dateTime2) {
        try {
            return BigDecimal.valueOf(this.dateLib.monthDiff(dateTime1, dateTime2));
        } catch (Exception e) {
            String message = String.format("monthDiff(%s, %s)", dateTime1, dateTime2);
            logError(message, e);
            return null;
        }
    }
