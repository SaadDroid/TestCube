public static <T> Iterator<T> distinct(final Iterator<T> iterator) {
        requireNonNull(iterator);
        return new AbstractIterator<T>() {
            private final PeekingIterator<T> peekingIterator = peekingIterator(iterator);
            private T curr = null;

            @Override
            protected T computeNext() {
                while (peekingIterator.hasNext() && Objects.equals(curr, peekingIterator.peek())) {
                    peekingIterator.next();
                }
                if (!peekingIterator.hasNext())
                    return endOfData();

                curr = peekingIterator.next();
                return curr;
            }
        };
    }
