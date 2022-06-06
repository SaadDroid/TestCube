public Promise<MemSize> getTotalCacheSize() {
		return cacheClient.list("**")
				.then(list -> Promise.of(MemSize.of(list.stream().mapToLong(FileMetadata::getSize).sum())));
	}
