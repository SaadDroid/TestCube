@Override
    @Cacheable(value = FindCacheNames.SIMILAR_DOCUMENTS, cacheResolver = CachingConfiguration.PER_USER_CACHE_RESOLVER_NAME)
    public Documents<HodSearchResult> findSimilar(final HodSuggestRequest suggestRequest) throws HodErrorException {
        return documentsService.findSimilar(suggestRequest);
    }
