@Override
    public Duration parse(final String value) {
        return until(parseDate(value));
    }
