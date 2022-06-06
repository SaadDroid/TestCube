@Override
    public <E, N extends OpenNode<E, N>> void traverseTree(Tree<E, N> tree, Walker<N> walker) {
        if (tree.isEmpty()) {
            walker.onEmpty();
            walker.onCompleted();
        }
        else {
            final Stack<TraversalState<E, N>> parents = new Stack<>();
            N current = tree.getRoot();

            while (!parents.isEmpty() || current != null) {
                if (current != null) {
                    final TraversalState<E, N> state = new TraversalState<>(current);
                    parents.push(state);
                    if (state.hasNextChild()) {
                        current = state.nextChild();
                    }
                    else {
                        current = null;
                    }
                }
                else {
                    final TraversalState<E, N> state = parents.peek();
                    if (state.hasNextChild()) {
                        current = state.nextChild();
                    }
                    if (!state.hasNextChild()) {
                        parents.pop();
                    }

                    if (!walker.onNext(state.getNode())) {
                        return;
                    }
                }
            }

            walker.onCompleted();
        }
    }
