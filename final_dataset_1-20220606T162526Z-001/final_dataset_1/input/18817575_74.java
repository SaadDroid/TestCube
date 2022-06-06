static <T> ReadOnlyIterator<T> readOnly(Iterator<T> iterator) {
        if (iterator == null) {
            throw new IllegalArgumentException("Method argument iterator must not be null.");
        }
        return new ReadOnlyIterator<>(iterator);
    }
