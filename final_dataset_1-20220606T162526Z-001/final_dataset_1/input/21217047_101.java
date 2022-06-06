@Override
    public boolean test(OpenNode<? extends E, ?> node) {
        return value.equals(node.getElement());
    }
