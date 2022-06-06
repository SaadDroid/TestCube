@Override
    public <E, N extends OpenNode<E, N>, T extends Tree<E, N>> void walkInOrder(T tree, Walker<N> walker) {
        inOrderTraversalDriver.traverseTree(tree, walker);
    }
