@Override
    public boolean test(final Comparable input) {
        if (null == input || !controlValue.getClass().isAssignableFrom(input.getClass())) {
            return false;
        }

        final int compareVal = controlValue.compareTo(input);
        if (orEqualTo) {
            return compareVal >= 0;
        }

        return compareVal > 0;
    }
