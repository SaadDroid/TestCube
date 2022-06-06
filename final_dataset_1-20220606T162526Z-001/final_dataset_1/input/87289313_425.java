@Override
    public String apply(final String input) {
        if (null == input) {
            return null;
        }

        return input.replaceAll(regex, replacement);
    }
