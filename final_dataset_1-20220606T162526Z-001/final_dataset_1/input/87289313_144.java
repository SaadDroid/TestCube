@Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(predicate.toString())
                .toString();
    }
