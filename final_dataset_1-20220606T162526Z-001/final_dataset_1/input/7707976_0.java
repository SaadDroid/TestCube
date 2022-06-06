public DataStream<T> query(long t1, long t2) {
		return new DataStream<T>(iterable(t1, t2));
	}
