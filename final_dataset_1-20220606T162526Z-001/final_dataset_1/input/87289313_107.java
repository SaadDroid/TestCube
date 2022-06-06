@Override
    public boolean test(final Collection<?> input) {
        return null == allowedValues || allowedValues.isEmpty() || (null != input && allowedValues.containsAll(input));
    }
