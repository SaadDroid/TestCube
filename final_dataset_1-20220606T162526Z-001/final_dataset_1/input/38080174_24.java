public static <K, T> StreamSorter<K, T> create(StreamSorterStorage<T> storage,
	                                               Function<T, K> keyFunction, Comparator<K> keyComparator, boolean distinct,
	                                               int itemsInMemorySize) {
		return new StreamSorter<>(storage, keyFunction, keyComparator, distinct, itemsInMemorySize);
	}
