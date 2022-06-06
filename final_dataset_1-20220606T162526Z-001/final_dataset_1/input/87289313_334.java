@Override
    @SuppressFBWarnings(value = "DE_MIGHT_IGNORE", justification = "Any exceptions are to be ignored")
    public Integer apply(final Iterable input) {
        if (null == input) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        try {
            return Iterables.size(input);
        } finally {
            CloseableUtil.close(input);
        }
    }
