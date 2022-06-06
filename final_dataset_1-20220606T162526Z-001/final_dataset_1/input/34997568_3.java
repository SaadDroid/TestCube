@SafeVarargs
	public static <T> ConjunctionMatcher<T> compose(Matcher<? super T>... matchers)
	{
		return compose(null, matchers);
	}
