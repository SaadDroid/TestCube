@SuppressWarnings("unchecked")
    public <E, N extends OpenNode<E, N>, T extends Tree<E, N>> TreeConstructor<E, N, T> get(Class<T> klass) {
        return getRaw(klass);
    }
