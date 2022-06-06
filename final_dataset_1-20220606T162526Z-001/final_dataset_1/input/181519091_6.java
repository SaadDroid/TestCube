public static void isGreaterThan(Number value, String property, String messagePrefix, Number min, Errors error) {
        if (value == null || value.doubleValue() <= min.doubleValue()) {
            error.rejectValue(property, messagePrefix + " should be greater than " + min);
        }
    }
