@Override
    public String apply(final String value) {
        if (null == value) {
            return null;
        }

        if (null == suffix) {
            return value;
        }

        return value + suffix;
    }
