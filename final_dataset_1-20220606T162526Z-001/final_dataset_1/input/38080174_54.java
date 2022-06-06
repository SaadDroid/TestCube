@Override
	public Promise<List<FileMetadata>> list(@NotNull String glob) {
		return Promise.ofBlockingCallable(executor, () -> doList(glob, false))
				.whenComplete(toLogger(logger, TRACE, "list", glob, this))
				.whenComplete(listPromise.recordStats());
	}
