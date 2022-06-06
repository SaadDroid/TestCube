@NotNull
    @Override
    public Iterator<IntToIntArray> descending(
            @NotNull
            final BitSet valueFilter) {
        return new Iterator<IntToIntArray>() {
            private int key = keysCount - 1;
            private IntToIntArray next = null;

            private void advance() {
                while (next == null && key >= 0) {
                    next = getFilteredValues(key--, valueFilter);
                }
            }

            @Override
            public boolean hasNext() {
                if (next != null)
                    return true;

                advance();

                return next != null;
            }

            @Override
            public IntToIntArray next() {
                if (!hasNext())
                    throw new NoSuchElementException();

                final IntToIntArray result = next;
                next = null;

                return result;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException(
                        "Removal not supported");
            }
        };
    }
