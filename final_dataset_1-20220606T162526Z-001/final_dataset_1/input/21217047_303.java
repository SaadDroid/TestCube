@Override
    public <E, N extends OpenNode<E, N>, T extends Tree<E, N>> Iterator<N> inOrderIterator(T tree) {
        final IteratorRemoveHandler<E, N, T> handler = iteratorRemoveHandlerProvider.get(tree);
        return new InOrderIterator<>(tree, handler);
    }
