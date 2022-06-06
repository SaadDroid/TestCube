@Override
    public void put(final int key, final int value) {
        if (key < 0)
            throw new IllegalArgumentException("Negative key");
        if (value < 0)
            throw new IllegalArgumentException("Negative value");

        final Integer previous = elements.put(key, value);

        if (previous != null)
            throw new IllegalArgumentException(
                    "Key <" + key + "> was already bound to <" + previous +
                    ">");
    }
