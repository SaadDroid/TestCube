public Promise<List<AggregationChunk>> getResult() {
		return chunksCollector.get();
	}
