public static <T> Case<T> nullableOf(Case<T> delegateCase) {
		return new NullableCase<>(delegateCase);
	}
