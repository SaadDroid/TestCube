@Override
    public <E, N extends OpenNode<E, N>, T extends Tree<E, N>> void walkElementsPreOrder(T tree, Walker<E> walker) {
        final Walker<N> nodeWalker = new NodeToElementWalker<>(walker);
        preOrderTraversalDriver.traverseTree(tree, nodeWalker);
    }
