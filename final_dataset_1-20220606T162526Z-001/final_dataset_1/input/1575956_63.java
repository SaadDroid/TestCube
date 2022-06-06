public static <T> OfLong mergeIteratorsForPrimitiveLongIterator(Iterator<T> iter1, Iterator<T> iter2,
            Comparator<T> comparator, ToLongFunction<T> function) {
        return new PrimitiveIterator.OfLong() {
            private T curIter1Entry = null;
            private T curIter2Entry = null;
            private boolean hasToPreFetch = true;

            @Override
            public boolean hasNext() {
                if (hasToPreFetch) {
                    if (curIter1Entry == null) {
                        curIter1Entry = iter1.hasNext() ? iter1.next() : null;
                    }
                    if (curIter2Entry == null) {
                        curIter2Entry = iter2.hasNext() ? iter2.next() : null;
                    }
                }
                hasToPreFetch = false;
                return (curIter1Entry != null || curIter2Entry != null);
            }

            @Override
            public long nextLong() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                T returnEntry = null;
                if (curIter1Entry != null && curIter2Entry != null) {
                    int compareValue = comparator.compare(curIter1Entry, curIter2Entry);
                    if (compareValue == 0) {
                        returnEntry = curIter1Entry;
                        curIter1Entry = null;
                        curIter2Entry = null;
                    } else if (compareValue < 0) {
                        returnEntry = curIter1Entry;
                        curIter1Entry = null;
                    } else {
                        returnEntry = curIter2Entry;
                        curIter2Entry = null;
                    }
                } else if (curIter1Entry != null) {
                    returnEntry = curIter1Entry;
                    curIter1Entry = null;
                } else {
                    returnEntry = curIter2Entry;
                    curIter2Entry = null;
                }
                hasToPreFetch = true;
                return function.applyAsLong(returnEntry);
            }
        };
    }
