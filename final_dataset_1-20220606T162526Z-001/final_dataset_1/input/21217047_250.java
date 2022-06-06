@Override
    public <E> NodeSelector<E> newSelector(Predicate<OpenNode<? extends E, ?>> predicate) {
        return new RootMatcherSelector<>(predicate);
    }
