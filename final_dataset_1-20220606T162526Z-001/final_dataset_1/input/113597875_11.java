@Override
    public E poll() {
        final E first = peek();
        if (first == null || !isExpired(first))
            return null;
        return super.poll(); // this could be a different element from first, but its expiration must be earlier, so it doesn't matter
    }
