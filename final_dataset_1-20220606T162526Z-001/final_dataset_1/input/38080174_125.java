public static AsyncExecutor buffered(int maxParallelCalls) {
		return buffered(maxParallelCalls, Integer.MAX_VALUE);
	}
