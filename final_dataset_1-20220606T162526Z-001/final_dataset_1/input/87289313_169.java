@Override
    public boolean test(final Map input) {
        if (null != input && null != keyPredicate) {
            for (final Object key : input.keySet()) {
                if (keyPredicate.test(key)) {
                    return true;
                }
            }
        }

        return false;
    }
