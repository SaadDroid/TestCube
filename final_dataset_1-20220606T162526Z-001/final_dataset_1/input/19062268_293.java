@SafeVarargs
	public final Collector<S> collect(S... elements) {
		this.base.addAll(Arrays.asList(elements));
		return this;
	}
