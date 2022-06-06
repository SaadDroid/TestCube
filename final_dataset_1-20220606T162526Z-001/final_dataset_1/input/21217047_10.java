@Override
    public <E, N extends OpenNode<E, N>> SimpleCollection<List<N>> pathsToLeaves(N node) {
        return new WrappingSimpleCollection<>(
            BackPathsFromLeaves
                .backPathsFromLeavesOf(node)
                .stream()
                .map(BackPath::toPath)
                .collect(Collectors.toSet()));
    }
