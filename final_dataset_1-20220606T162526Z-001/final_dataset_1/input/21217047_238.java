@Override
    public final MutableTreeImpl<E> build() {
        return new MutableTreeImpl<>(null, new FixedUncheckedSimpleCollection<>(new Object[0]));
    }
