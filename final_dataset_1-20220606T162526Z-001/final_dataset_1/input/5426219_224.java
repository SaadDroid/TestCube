public ImmutableMap<String, String> getPathwayNames(Collection<String> stableIds) {
        ImmutableMap.Builder<String, String> mappedStableIdsBuilder = ImmutableMap.builder();
        for (List<String> partition : getPartitions(stableIds)) {
            mappedStableIdsBuilder.putAll(fetchPathwayNames(partition));
        }
        return getMappedIds(stableIds, mappedStableIdsBuilder);
    }
