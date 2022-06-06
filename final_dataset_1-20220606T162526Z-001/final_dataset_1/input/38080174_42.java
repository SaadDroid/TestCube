@Override
	public Promise<ChannelSupplier<ByteBuf>> download(@NotNull String name, long offset, long length) {
		checkArgument(offset >= 0, "Data offset must be greater than or equal to zero");
		checkArgument(length >= -1, "Data length must be either -1 or greater than or equal to zero");

		return cacheClient.getMetadata(name)
				.then(cacheMetadata -> {
					if (cacheMetadata == null) {
						if (offset != 0) {
							return mainClient.download(name, offset, length);
						}
						return mainClient.getMetadata(name)
								.then(mainMetadata -> {
									if (mainMetadata == null) {
										return Promise.ofException(new StacklessException(CachedFsClient.class, "File not found: " + name));
									}
									return downloadToCache(name, offset, length, 0, mainMetadata.getSize());
								});
					}
					long sizeInCache = cacheMetadata.getSize();

					if (length != -1 && sizeInCache >= offset + length) {
						return cacheClient.download(name, offset, length)
								.whenComplete(() -> updateCacheStats(name));
					}

					if (offset > sizeInCache) {
						return mainClient.download(name, offset, length);
					}

					return mainClient.getMetadata(name)
							.then(mainMetadata -> {
								if (mainMetadata == null) {
									return cacheClient.download(name, offset, length)
											.whenComplete(() -> updateCacheStats(name));
								}

								long sizeInMain = mainMetadata.getSize();

								if (sizeInCache >= sizeInMain) {
									return cacheClient.download(name, offset, length)
											.whenComplete(() -> updateCacheStats(name));
								}

								if ((length != -1) && (sizeInMain < (offset + length))) {
									String repr = name + "(size=" + sizeInMain + (offset != 0 ? ", offset=" + offset : "") + ", length=" + length;
									return Promise.ofException(new StacklessException(CachedFsClient.class, "Boundaries exceed file size: " + repr));
								}

								return downloadToCache(name, offset, length, sizeInCache, sizeInMain);
							});

				});
	}
