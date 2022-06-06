public ImmutableList<String> findSpecies(SemanticQuery geneQuery, SemanticQuery conditionQuery) {
        return readSpecies(miscellaneousAnalyticsSearchDao.getSpecies(geneQuery, conditionQuery));
    }
