@Override
    public Iterable<O_ITEM> apply(final Iterable<I_ITEM> items) {
        return IterableUtil.map(items, functions);
    }
