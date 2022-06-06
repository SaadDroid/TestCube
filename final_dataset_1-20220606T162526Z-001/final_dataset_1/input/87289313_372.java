@Override
    public T apply(final T first, final T second) {
        final int firstLength = delegate.apply(first);
        final int secondLength = delegate.apply(second);

        return (firstLength - secondLength) > 0 ? first : second;
    }
