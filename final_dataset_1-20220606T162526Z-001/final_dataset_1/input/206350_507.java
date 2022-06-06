public SQLSelect<T> sharedCache() {
		return cacheStrategy(QueryCacheStrategy.SHARED_CACHE);
	}
