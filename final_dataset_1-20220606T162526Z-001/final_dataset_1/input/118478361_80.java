@Override
    public XMLGregorianCalendar date(BigDecimal year, BigDecimal month, BigDecimal day) {
        try {
            if (year == null || month == null || day == null) {
                return null;
            }
            if (year.intValue() < 0 || month.intValue() < 0 || day.intValue() < 0) {
                return null;
            }

            String literal = String.format("%04d-%02d-%02d", year.intValue(), month.intValue(), day.intValue());
            return this.feelLib.date(literal);
        } catch (Exception e) {
            String message = String.format("date(%s, %s, %s)", year, month, day);
            logError(message, e);
            return null;
        }
    }
