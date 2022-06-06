@Override
    public XMLGregorianCalendar time(String literal) {
        try {
            return this.timeLib.time(literal);
        } catch (Exception e) {
            String message = String.format("time(%s)", literal);
            logError(message, e);
            return null;
        }
    }
