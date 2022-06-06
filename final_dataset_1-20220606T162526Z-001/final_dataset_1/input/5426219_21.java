public Map<String, Map<String, List<String>>> getCellIdsInExperiments(String... geneIds) {
        return fetchInParallel(
                ImmutableSet.copyOf(geneIds),
                geneId -> geneSearchDao.fetchCellIds(geneId));
    }
