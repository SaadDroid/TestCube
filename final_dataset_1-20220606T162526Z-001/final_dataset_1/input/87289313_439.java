@Override
    public List<String> apply(final String input) {
        // If null, StringUtils will return null.
        final String[] arr = StringUtils.split(input, delimiter);

        if (null == arr) {
            return null;
        }

        return Arrays.asList(arr);
    }
