@Override
    public VF2SubgraphMappingIterator<V, E> getMappings()
    {
        return new VF2SubgraphMappingIterator<>(
            ordering1, ordering2, vertexComparator, edgeComparator);
    }
