@Override
    public <E, N extends OpenNode<E, N>> Iterator<E> postOrderElementsIterator(Tree<E, N> tree) {
        return new NodeToElementIterators<>(new PostOrderIterator<>(tree, iteratorRemoveHandlerProvider.get(tree)));
    }
