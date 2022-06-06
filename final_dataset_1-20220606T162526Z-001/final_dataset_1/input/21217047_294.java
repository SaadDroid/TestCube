@Override
    public <E, N extends OpenNode<E, N>, T extends Tree<E, N>> void walkElementsInOrder(T tree, Walker<E> walker) {
        final Walker<N> nodeWalker = new NodeToElementWalker<>(walker);
        inOrderTraversalDriver.traverseTree(tree, nodeWalker);
    }
