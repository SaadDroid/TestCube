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
            final EqualityMatcher<E> matcher = (EqualityMatcher<E>)o;
            return matcher.value.equals(value);
        }
        else {
            return false;
        }
    }
