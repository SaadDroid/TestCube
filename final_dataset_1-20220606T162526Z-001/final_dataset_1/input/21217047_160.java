@Override
    public ParentReference<MutableBinaryTreeNode<E>> wrap(MutableBinaryTreeNode<E> node) {
        return (oldRoot, newRoot) -> {
            if (node.getLeft() == oldRoot) {
                final MutableBinaryTreeNodeImpl<E> concreteNode = (MutableBinaryTreeNodeImpl<E>)node;
                concreteNode.setInternalLeft((MutableBinaryTreeNodeImpl<E>)newRoot);
            }
            else if (node.getRight() == oldRoot) {
                final MutableBinaryTreeNodeImpl<E> concreteNode = (MutableBinaryTreeNodeImpl<E>)node;
                concreteNode.setInternalRight((MutableBinaryTreeNodeImpl<E>) newRoot);
            }
            else {
                throw new IllegalArgumentException("The current node is not a child of parent");
            }
        };
    }
