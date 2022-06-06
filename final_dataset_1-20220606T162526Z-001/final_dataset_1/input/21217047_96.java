@Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        else if (o == this) {
            return true;
        }
        else if (o.getClass().equals(getClass())) {
            @SuppressWarnings("unchecked")
            final EqualsToMatcher<E> matcher = (EqualsToMatcher<E>)o;
            return matcher.comparator.equals(comparator) && matcher.value.equals(value);
        }
        else {
            return false;
        }
    }
