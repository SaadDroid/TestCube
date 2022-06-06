public ConjunctionMatcher<T> and(Matcher<? super T> matcher)
	{
		requireNonNull(matcher, "matcher");
		
		return new ConjunctionMatcher<>(compositeDescription, concat(matchers, matcher));
	}
