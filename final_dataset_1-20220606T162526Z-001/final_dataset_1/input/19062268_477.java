public static Literal<String> of(String value) {
		checkNotNull(value,STRING_CANNOT_BE_NULL);
		return new ImmutableLiteral<String>(value);
	}
