@Override
    public boolean test(final Object input) {
        return null == input || null == type || type.isAssignableFrom(input.getClass());
    }
