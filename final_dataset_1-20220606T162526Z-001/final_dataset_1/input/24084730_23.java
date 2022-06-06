private static int parseInteger(final String text) {
        // This methods expects |text| is not null.
        final String textTrimmed = text.trim();

        final int length = textTrimmed.length();
        if ("null".equals(textTrimmed)) {
            throw new NullPointerException("\"" + text + "\" is considered to be null.");
        }

        if (length > 9) {
            final long longValue = Long.parseLong(textTrimmed);
            if (longValue < Integer.MIN_VALUE || longValue > Integer.MAX_VALUE) {
                throw new NumberFormatException("Overflow: \"" + text + "\" is out of range of int.");
            }
            return Integer.valueOf((int) longValue);
        }
        if (length == 0) {
            throw new NullPointerException("\"" + text + "\" is considered to be an empty string.");
        }
        return Integer.valueOf(parseIntegerInternal(textTrimmed));
    }
