public Set<String> calculate(String source, int offset) {
		rebuildCacheIfNecessary(source);
		if (offset == 0) {
			return unmodifiableSet(allWordsCache);
		}
		String wanted = getTextbefore(source, offset);
		return filter(allWordsCache, wanted);
	}
